package com.shengsiyuan.network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection2
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://xueshu.baidu.com");
		
//		URLConnection conn = url.openConnection();
//		
//		InputStream is = conn.getInputStream();
		
		InputStream is = url.openStream();
		
		
		OutputStream os = new FileOutputStream("C:\\Users\\Administrator.3DLZQQ2VJC0X4S5\\Desktop\\infoq.html");
		
		byte[] buffer = new byte[2048];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer, 0, buffer.length)))
		{
			os.write(buffer, 0, length);
		}
		
		is.close();
		os.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
