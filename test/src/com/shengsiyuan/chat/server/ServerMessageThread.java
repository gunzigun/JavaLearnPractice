package com.shengsiyuan.chat.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.shengsiyuan.chat.util.CharacterUtil;
import com.shengsiyuan.chat.util.XMLUtil;

public class ServerMessageThread extends Thread
{
	private Server server;
	
	private InputStream is;
	
	private OutputStream os;
	
	public ServerMessageThread(Server server, Socket socket)
	{
		try
		{
			this.server = server;
			
			this.is = socket.getInputStream();
			
			this.os = socket.getOutputStream();
		}
		catch(Exception ex)
		{
			
		}
	}
	
	// 更新用户列表
	// 首先更新服务器端的用户列表
	// 然后更新客户端的用户列表
	public void updateUserList()
	{
		//获得用户名的集合
		Set<String> users = this.server.getMap().keySet();
		//构造向客户端发送的在线用户列表数据xml
		String xml = XMLUtil.constructUserList(users);
		
		String str = "";
		
		for(String user : users)
		{
			str += user + "\n";
		}
		
		//首先更新服务器端的用户列表
		this.server.getJTextArea().setText(str);
		
		Collection<ServerMessageThread> cols = this.server.getMap().values();
		
		//遍历与每一个客户端对应的线程，向每一个客户端发送在线用户列表
		for(ServerMessageThread smt : cols)
		{
			smt.sendMessage(xml);
		}
	}
	
	//向客户端发送数据
	public void sendMessage(String message)
	{
		try
		{
			os.write(message.getBytes());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				byte[] buf = new byte[5000];
				
				int length = this.is.read(buf);
				
				//客户端发来的消息
				String xml = new String(buf,0,length);
				
				int type = Integer.parseInt(XMLUtil.extractType(xml));
				
				// 聊天数据
				if(CharacterUtil.CLIENT_MESSAGE == type)
				{
					//用户名（谁发来的消息）
					String username = XMLUtil.extractUsername(xml);
					//聊天的文本内容
					String content = XMLUtil.extractContent(xml);
					
					//构造向所有客户端发送的消息
					String message = username + " : " + content;
					//向所有客户端发送的XML聊天数据
					String messageXML = XMLUtil.constructServerMessageXML(message);
					
					Map<String, ServerMessageThread> map = this.server.getMap();
					
					Collection<ServerMessageThread> cols = map.values();
					
					for(ServerMessageThread smt : cols)
					{
						//向XML聊天数据发送给每一个客户端
						smt.sendMessage(messageXML);
					}
				}
				// 关闭客户端窗口
				else if(CharacterUtil.CLOSE_CLIENT_WINDOW == type)
				{
					String username = XMLUtil.extractUsername(xml);
					//获得待删除用户所对应的线程对象
					ServerMessageThread smt = this.server.getMap().get(username);
					//构造出向客户端确认关闭的XML信息
					String confirmationXML = XMLUtil.constructCloseClientWindowConfirmationXML();
					//向客户端发送任意一条确认信息
					smt.sendMessage(confirmationXML);
					
					// 从用户列表的Map中将该用户去除
					this.server.getMap().remove(username);
					// 更新在线用户列表
					this.updateUserList();
					
					this.is.close();
					this.os.close();
					
					break; // 结束该线程
				}				
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
