package com.aleiolandap;

import org.springframework.web.bind.annotation.RequestMapping;

public class Greeting {
	private final long id;
	private final String content;
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	/*private String name;
	private String lastName;
	private long id = 0;
	
	public Greeting(String name, String lastName, long id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		countId();
	}
	
	public String countId() {
		return "Nome: " + this.name + " Sobrenome: " + this.lastName + " Id: " + this.id;
	}*/
	
}
