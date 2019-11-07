package com.shengsiyuan.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation
{
	String hello() default "shengsiyuan";

	String world();
}
