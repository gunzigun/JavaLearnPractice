package com.shengsiyuan.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.shengsiyuan.chat.util.XMLUtil;


public class Server extends JFrame
{
	private JLabel jLabel1;

	private JLabel jLabel2;

	private JLabel jLabel3;

	private JButton jButton;

	private JPanel jPanel1;

	private JPanel jPanel2;

	private JScrollPane jScrollPane;

	private JTextArea jTextArea;

	private JTextField jTextField;
	
	private Map<String, ServerMessageThread> map = new HashMap<String, ServerMessageThread>();
	
	public Server(String name)
	{
		super(name);

		this.initComponents(); //initialize UI
	}
	
	public Map<String, ServerMessageThread> getMap()
	{
		return map;
	}

	public JLabel getJLabel2()
	{
		return jLabel2;
	}

	public JButton getJButton()
	{
		return jButton;
	}

	public JTextArea getJTextArea()
	{
		return jTextArea;
	}

	public JTextField getJTextField()
	{
		return jTextField;
	}

	public void setJTextField(JTextField textField)
	{
		jTextField = textField;
	}

	private void initComponents()
	{
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		
		jTextField = new JTextField(10);
		jButton = new JButton();
		jScrollPane = new JScrollPane();
		jTextArea = new JTextArea();
		

		jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));

		jTextField.setText("5000");
		
		jLabel1.setText("服务器状态");
		jLabel2.setText("停止");
		jLabel2.setForeground(new Color(204, 0, 51));
		jLabel3.setText("端口号");

		jButton.setText("启动服务器");
		
		
		jButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Server.this.execute(event);
			}
		});
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				try
				{
					Collection<ServerMessageThread> cols = Server.this.map.values();
					
					String messageXML = XMLUtil.constructCloseServerWindowXML();
					
					for(ServerMessageThread smt : cols)
					{
						smt.sendMessage(messageXML);
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					System.exit(0);
				}
			}
		});
		

		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jTextField);
		jPanel1.add(jButton);

		jTextArea.setEditable(false); //不允许用户手动修改在线用户列表
		jTextArea.setRows(20);
		jTextArea.setColumns(30);
		jTextArea.setForeground(new Color(0, 51, 204));

		jScrollPane.setViewportView(jTextArea); //将JTextArea放置到JScrollPane中

		jPanel2.add(jScrollPane);

		this.getContentPane().add(jPanel1, BorderLayout.NORTH);
		this.getContentPane().add(jPanel2, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

	private void execute(ActionEvent evt)
	{
		int port = Integer.parseInt(this.getJTextField().getText());
		
		new ServerConnection(this, port).start();
	}

	public static void main(String[] args)
	{
		new Server("服务器");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}