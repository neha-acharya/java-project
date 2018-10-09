package com.guruofjava.deloitte2.inheritance;

import java.nio.charset.MalformedInputException;

public abstract class Animal extends Object{
	boolean alive;
	{
		alive=true;
	}
	
	public void eat() {
		System.out.println("Animal is Eating");
		
	}
	
/*	public void move(int distance){
		System.out.println("Animal is moving "+distance+" distance");
	}
*/
	public abstract void move(int distance);
}
