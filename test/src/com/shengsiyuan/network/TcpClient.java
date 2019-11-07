package com.shengsiyuan.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1", 5000);
		
		InputStream is = socket.getInputStream();
		
		OutputStream os = socket.getOutputStream();
		
		os.write("hello world".getBytes());
		
		byte[] buffer = new byte[200];
		
		int length = is.read(buffer);
		
		System.out.println(new String(buffer, 0 ,length));
		
//		int length = 0;
//		
//		while(-1 != (length = is.read(buffer,0, buffer.length)))
//		{
//			String str = new String(buffer, 0, length);
//			
//			System.out.println(str);
//		}
		
		is.close();
		os.close();
		socket.close();
	}
}
