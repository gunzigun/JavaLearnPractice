package com.shengsiyuan.network;

import java.net.URL;

public class Url1
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL(
				"http://java.sun.com:80/docs/books/tutorial/index.html#DOWN");

		String protocol = url.getProtocol();
		String host = url.getHost();
		String file = url.getFile();
		int port = url.getPort();
		String ref = url.getRef();

		System.out.println(protocol + ", " + host + ", " + file + ", " + port
				+ ", " + ref);
	}
}
