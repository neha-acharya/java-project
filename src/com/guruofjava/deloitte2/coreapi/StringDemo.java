package com.guruofjava.deloitte2.coreapi;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Java Programming Language";
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.charAt(9));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		System.out.println(s1.hashCode());
		s1=s1+",created by James";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(10, 12));
		
		System.out.println(s1.contains("mm"));
		String s2=" ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.trim().isEmpty());
	}

}
