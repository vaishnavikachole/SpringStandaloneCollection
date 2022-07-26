package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/standaloneconfig.xml");
         Person person = (Person) context.getBean("person1");
         
         
         System.out.println(person);
         System.out.println(person.getFriends().getClass().getName());
    }
}
