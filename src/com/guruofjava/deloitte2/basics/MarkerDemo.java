package com.guruofjava.deloitte2.basics;

import java.util.Date;

public class MarkerDemo {
/*	public static void main1(String[] args) {
		Marker m1;
		m1=new Marker();
		Marker m2=new Marker();
		System.out.println(m1.price);
		System.out.println(m2.price);
		m2.price=2090;
		System.out.println(m2.price);
		
	}
	public static void main(String[] args) {
		Marker m1=new Marker("camlin","black",8.9);
		System.out.println(m1.brand);
		System.out.println(m1.color);
		m1.price=9;
		System.out.println(m1.price);
	}

	public static void main1(String[] args) {
		Marker m1=new Marker("camlin","black",25);
		Marker m2=new Marker("kores","blue",20);
		System.out.println(Marker.category);
		System.out.println(m1.color);
		System.out.println(m2.color);
		System.out.println(m1.category);
		System.out.println(m2.category);
	
		m1.color="Green";
		m2.color="Red";
		
		m1.category= "Stationary";
		m2.category="writing instruments";
		
		System.out.println(m1.color);
		System.out.println(m2.color);
		System.out.println(m1.category);
		System.out.println(m2.category);
		
		System.out.println(m1.getPrice());
		m1.write("james");
		m1.write(20005);
		//m1.write(25.00);
	}
	*/
	public static void main(String[] args) {
		Marker m1=new Marker();
		Date d2=new Date();
		System.out.println(m1.color);
		System.out.println(d2.toString());
		m1.setPrice(25);
		
	}
}
