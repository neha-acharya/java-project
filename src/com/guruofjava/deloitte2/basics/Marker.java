package com.guruofjava.deloitte2.basics;

public class Marker {
	public Marker(){
		System.out.println("Marker object created");
		price=20.0;
	}
	static String category="pens";
	public Marker(String v){
		brand=v;
	}
	public Marker(String a,String b,double price){
		brand=a;
		color=b;
		price=price;
	}
	public void write(int input){
		System.out.println(input);
	}
	
	public void write(String input){
		System.out.println(input);
	}
	
		String brand="Kores";
		String color;
		double price;
		
		public void setPrice(double p){
		//	price=p;
			this.price=price;
			
		}
		
		public double getPrice(){
			return price;
		}
		public static void printPrice(){
			System.out.println();
		}
		public static void setCategory(String cat){
			category=cat;
		}
}
