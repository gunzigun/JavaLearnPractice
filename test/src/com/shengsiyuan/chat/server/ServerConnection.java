package com.shengsiyuan.chat.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

import com.shengsiyuan.chat.util.XMLUtil;

public class ServerConnection extends Thread
{
	private ServerSocket serverSocket;
	
	private Server server;
	
	public ServerConnection(Server server, int port)
	{
		try
		{
			this.server = server;
			
			this.serverSocket = new ServerSocket(port);
			
			// 下面两行代码不能放到上面一行代码之前
			// 因为服务器启动时有可能会抛出异常
			// 如果放在上面，则发生异常时也会导致label上的文本发生变化
			// 这与实际情况不符
			this.server.getJLabel2().setText("运行");
			this.server.getJButton().setEnabled(false);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
			JOptionPane.showMessageDialog(this.server, "端口号被占用！", "警告", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Socket socket = this.serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				byte[] buf = new byte[5000];
				int length = is.read(buf);
				
				//客户端发来的连接信息（包括了用户名）
				String loginXML = new String(buf, 0, length); 
				
				// 从客户端登录数据中提取出用户名信息（username）
				String username = XMLUtil.extractUsername(loginXML); 
				
				String loginResult = null;
				
				// 判断用户是否登录成功
				boolean isLogin = false;
				
				// 判断用户名是否重复
				// 用户名重复
				if(this.server.getMap().containsKey(username))
				{
					loginResult = "failure";
				}
				// 用户名不重复
				else
				{
					loginResult = "success";
					
					isLogin = true;
				}
				
				String xml = XMLUtil.constructLoginResultXML(loginResult);
				
				os.write(xml.getBytes());
				
				// 如果用户登录成功，启动线程
				if(isLogin)
				{
					// 准备创建新的线程，用于处理用户的聊天数据，每一个连接上的用户都会对应一个该线程
					ServerMessageThread serverMessageThread = new ServerMessageThread(this.server, socket);
					//将用户名及与之对应的线程对象 放到Map中
					this.server.getMap().put(username, serverMessageThread);
					
					//更新用户列表（服务器端+客户端）
					serverMessageThread.updateUserList();
					
					serverMessageThread.start();
				}				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
