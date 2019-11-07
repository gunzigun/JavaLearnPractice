package com.shengsiyuan.network;

import java.io.IOException;
import java.net.Socket;

public class MainClient
{
	public static void main(String[] args) throws Exception, IOException
	{
		Socket socket = new Socket("127.0.0.1", 4000);

		new ClientInputThread(socket).start();
		new ClientOutputThread(socket).start();
	}
}
