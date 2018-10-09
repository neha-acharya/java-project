package com.guruofjava.deloitte2.inheritance;

public abstract class Cat extends Animal implements Hunter,Jumper,Runner {


		@override
		public void jump(int length){
			System.out.println("Cat jumping: "+length+" distance");
		}
		@override
		public void run(int distance){
			System.out.println("Cat running: "+distance+" distance");
		}
		@override
		public void hunt(){
			System.out.println("Cat is hunting");
		}
		@override
		public void move(int distance){
			System.out.println("cat is moving: "+distance+" distance");
		}
		
	}

