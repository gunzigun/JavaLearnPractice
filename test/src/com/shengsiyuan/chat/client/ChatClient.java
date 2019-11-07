package com.shengsiyuan.chat.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatClient extends javax.swing.JFrame
{ 
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField;
	
	private ClientConnection clientConnection;
	
	public ChatClient(ClientConnection clientConnection)
	{
		this.clientConnection = clientConnection;
		
		initComponents();
	}

	public JTextArea getJTextArea2()
	{
		return jTextArea2;
	}

	public JTextArea getJTextArea1()
	{
		return jTextArea1;
	}

	private void initComponents()
	{
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jTextField = new javax.swing.JTextField(20);
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();

		jPanel3 = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("聊天室");
		setResizable(false);
		jPanel1.setBorder(BorderFactory.createTitledBorder("聊天室信息"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));
		jTextArea1.setColumns(30);
		jTextArea1.setRows(25);

		jTextArea2.setColumns(20);
		jTextArea2.setRows(25);

		this.jTextArea1.setEditable(false);
		this.jTextArea2.setEditable(false);
		
		jPanel3.add(jTextField);
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);

		jPanel1.setLayout(new BorderLayout());
		jPanel1.add(jScrollPane1, BorderLayout.NORTH);
		jPanel1.add(jPanel3, BorderLayout.SOUTH);

		jPanel2.add(jScrollPane2);

		jScrollPane1.setViewportView(jTextArea1);
		jScrollPane2.setViewportView(jTextArea2);

		jButton1.setText("发送");
		jButton2.setText("清屏");
		
		jButton1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ChatClient.this.sendMessage(e);
			}
		});
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				try
				{
					ChatClient.this.clientConnection.sendMessage("client closed", "5");
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		

		this.setLayout(new FlowLayout());
		this.getContentPane().add(jPanel1);
		this.getContentPane().add(jPanel2);


		this.pack();
		this.setVisible(true);
	}
	
	private void sendMessage(ActionEvent event)
	{
		// 用户聊天的数据
		String message = this.jTextField.getText();
		// 清空聊天数据
		this.jTextField.setText("");
		// 向服务器端发送聊天数据
		this.clientConnection.sendMessage(message, "2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
