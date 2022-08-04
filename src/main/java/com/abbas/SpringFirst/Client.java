package com.abbas.SpringFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
	
	public static void main(String arg[])
	{
		try
		{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/abbas/SpringFirst/applicationContext.xml");	
		ServiceProvider s1=	 (ServiceProvider) context.getBean("sp");
		ServiceProvider s2=	 (ServiceProvider) context.getBean("sp");
		
		System.out.println(s1.askForBulb());
		System.out.println(s2);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
