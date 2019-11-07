package com.shengsiyuan.proxy;

public class RealSubject extends Subject
{
	public void request()
	{
		System.out.println("From real subject.");
	}
}
