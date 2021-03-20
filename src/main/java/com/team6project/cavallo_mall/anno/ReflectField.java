package com.team6project.cavallo_mall.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/18 14:25
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReflectField {

	/*
	Mapping field name
	 */
	String value() default "";
	
	/*
	Ignore type verification
	 */
	boolean isPojo() default false;

}
