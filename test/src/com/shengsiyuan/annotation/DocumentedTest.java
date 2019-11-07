package com.shengsiyuan.annotation;

import java.lang.annotation.Inherited;

public class DocumentedTest
{
	@DocumentedAnnotation(hello = "welcome")
	protected void method()
	{
		System.out.println("hello world");
	}
}
