package corejava;

import com.guruofjava.deloitte2.basics.Marker;

public class MarkerSwap {
	public static void main(String[] args) {
		Marker a=new Marker("Reynolds","Black",25);
		Marker b=new Marker("Camlin","Blue",22);
		
		System.out.println(a.getPrice()+" "+b.getPrice());
		
		swap(a,b);
		System.out.println(a.getPrice()+" "+b.getPrice());
	}
	public static void swap(Marker m1,Marker m2){
	//	double temp=m1.getPrice();
		
	}

}
