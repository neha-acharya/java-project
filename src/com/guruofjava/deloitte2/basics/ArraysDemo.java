package com.guruofjava.deloitte2.basics;

public class ArraysDemo {
	public static void main1(String[] args) {
		int[] a={1,9,7,5,3,4,6,8};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		int temp=0;
		for(int i=0;i<a.length;i++)
		for(int j=0;j<a.length-1;j++){
			if (a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main2(String[] args) {
		Marker[] m;
		m=new Marker[3];
		m[2]=new Marker();
		System.out.println(m[2].getPrice());
	}
	public static void main(String[] args) {

		int[][] c={{12,15},{16,20,36,84},{32,21,22},{16}};
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
