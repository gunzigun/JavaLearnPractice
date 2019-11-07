package com.shengsiyuan.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client extends JFrame
{
	private JButton jButton1; 

	private JButton jButton2;

	private JLabel jLabel1;

	private JLabel jLabel2;

	private JLabel jLabel3;

	private JPanel jPanel;

	private JTextField username;

	private JTextField hostAddress;

	private JTextField port;

	public Client(String name)
	{
		super(name);

		initComponents(); // initialize UI
	}

	private void initComponents()
	{
		jPanel = new JPanel();

		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();

		username = new JTextField(15);
		hostAddress = new JTextField(15);
		port = new JTextField(15);

		jButton1 = new JButton();
		jButton2 = new JButton();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setResizable(false);

		jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("用户登录"));

		jLabel1.setText("用户名");
		jLabel2.setText("服务器");
		jLabel3.setText("端口号");

		jButton1.setText("登录");
		jButton2.setText("重置");
		
		jButton1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Client.this.login(e);
			}
		});

		username.setText("zhangsan");
		hostAddress.setText("localhost");
		port.setText("5000");
		
		jPanel.add(jLabel1);
		jPanel.add(username);
		jPanel.add(jLabel2);
		jPanel.add(hostAddress);
		jPanel.add(jLabel3);
		jPanel.add(port);

		jPanel.add(jButton1);
		jPanel.add(jButton2);

		this.getContentPane().add(jPanel);

		this.setSize(250, 300);
		this.setVisible(true);
	}
	
	private void login(ActionEvent event)
	{
		String username = this.username.getText();
		String hostAddress = this.hostAddress.getText();
		String port = this.port.getText();
		
		ClientConnection clientConnection = new ClientConnection(this, hostAddress, Integer.parseInt(port), username);
		
		if(clientConnection.login())
		{
			clientConnection.start();
		}
		else
		{
			JOptionPane.showMessageDialog(this, "用户名重复！", "错误", JOptionPane.ERROR_MESSAGE);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args)
	{
		new Client("用户登录");
	}

}
