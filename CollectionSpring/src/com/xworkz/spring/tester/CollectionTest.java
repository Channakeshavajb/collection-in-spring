package com.xworkz.spring.tester;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.Person;

public class CollectionTest {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resource/context.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person.getList());
		System.out.println("**********************************");
		System.out.println(person.getSet());
		System.out.println("**********************************");
		System.out.println(person.getMap());
		System.out.println("**********************************");
		System.out.println(person.getBooklist());
	}

}
