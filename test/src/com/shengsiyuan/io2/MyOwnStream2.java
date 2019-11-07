package com.shengsiyuan.io2;

import java.io.IOException;
import java.io.InputStream;

public class MyOwnStream2 extends InputStream
{
	protected byte[] data;
	
	protected int ptr = 0;
	
	protected int mark = 0;
	
	public MyOwnStream2(byte[] b)
	{
		this.data = b;
	}
	
	public int read()
	{
		return (ptr < data.length) ? (data[ptr++]) : -1;
	}
	
	@Override
	public int available() throws IOException
	{
		return data.length - ptr;
	}
	
	@Override
	public void close() throws IOException
	{
		ptr = data.length;
	}
	
	@Override
	public synchronized void mark(int readlimit)
	{
		this.mark = readlimit;
	}
	
	@Override
	public synchronized void reset() throws IOException
	{
		if(mark < 0 || mark >= data.length)
		{
			throw new IOException("the position is not valid");
		}
		
		ptr = mark;
	}
	
	@Override
	public boolean markSupported()
	{
		return true;
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException
	{
		if(this.ptr >= data.length || len < 0)
		{
			return -1;
		}
		
		if((this.ptr + len) > data.length)
		{
			len = data.length - this.ptr;
		}
		
		if(len == 0)
		{
			return 0;
		}
		
		System.arraycopy(data, ptr, b, off, len);
		
		ptr += len;
		
		return len;
	}	
}