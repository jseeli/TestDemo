package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanTestCase 
{
	public static void main(String arg[])
	{
		System.out.println("---Test Case - AnnotationConfigApplication Context Object Created---");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		System.out.println("---Scan Method Called---");
		context.scan("com.mobitel.MobitelBackend");
		
		System.out.println("---Refresh Method Called---");
		context.refresh();
		
		System.out.println("---My Bean Created---");
		
		MyBean myBean1=(MyBean)context.getBean("myean");
		
		myBean1.display();
		
		MyBean myBean2=(MyBean)context.getBean("myBean");
		
		myBean2.display();
		
	}
}
