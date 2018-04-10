package com.xxx.domain;

public class DemoObj {

	private String id ;
	private String name;
	
	public DemoObj() {
		super();
	}
	public DemoObj(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "DemoObj [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
