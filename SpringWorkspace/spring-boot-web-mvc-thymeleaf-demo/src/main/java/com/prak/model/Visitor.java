package com.prak.model;

public class Visitor {
	private String name;
	private String mobile;
	
	public Visitor() {
		/* default constructor */
	}

	public Visitor(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
