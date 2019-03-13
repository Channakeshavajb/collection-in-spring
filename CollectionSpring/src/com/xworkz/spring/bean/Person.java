package com.xworkz.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private List<Object> list;
	private Set<Object> set;
	private Map<Object, Object> map;
	private List<Book> booklist;

	public Person() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void setList(List<Object> list) {
		System.out.println("invoked setList");
		this.list = list;
	}

	public List<Object> getList() {
		return list;
	}

	public void setSet(Set<Object> set) {
		System.out.println("invoked setSet");
		this.set = set;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setMap(Map<Object, Object> map) {
		System.out.println("invoked setMap");
		this.map = map;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setBooklist(List<Book> booklist) {
		System.out.println("invoked setBooklist");
		this.booklist = booklist;
	}

	public List<Book> getBooklist() {
		return booklist;
	}
}
