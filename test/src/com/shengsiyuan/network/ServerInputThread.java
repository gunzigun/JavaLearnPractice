package com.shengsiyuan.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerInputThread extends Thread
{
	private Socket socket;
	
	public ServerInputThread(Socket socket)
	{
		this.socket = socket;
	}
	
	@Override
	public void run()
	{
		try
		{
			InputStream is = socket.getInputStream();
			
			while(true)
			{
				byte[] buffer = new byte[1024];
				
				int length = is.read(buffer);
				
				String str = new String(buffer, 0, length);
				
				System.out.println(str);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
