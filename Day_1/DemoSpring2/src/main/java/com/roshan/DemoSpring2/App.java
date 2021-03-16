package com.roshan.DemoSpring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       Employee e = (Employee)context.getBean("Employee");
       Employee e1 = (Employee)context.getBean("Employee1");
       System.out.println(e);
       System.out.println(e1);
    }
}
