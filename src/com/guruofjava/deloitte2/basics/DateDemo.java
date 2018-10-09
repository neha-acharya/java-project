package com.guruofjava.deloitte2.basics;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		
		Date d1=new Date();
		Date d2=new Date();
		d2.setTime(d2.getTime() + 50000000);
		System.out.println(d2);
		System.out.println(d1.getTime());
		d1.setTime(0);
		System.out.println(d1);
		System.out.println(d1.getTime());
	}

}
