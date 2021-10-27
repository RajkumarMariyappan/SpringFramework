package com.basic.Autowire;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
	private int lid;
	private String lbrand;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLbrand() {
		return lbrand;
	}

	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}

	public void compile() {
		System.out.println("Compiling...");
	}
}
