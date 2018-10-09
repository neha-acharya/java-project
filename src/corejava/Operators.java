package corejava;

public class Operators {
	public static void main1(String[] args) {
		int a,b;
		a=250;
		b=120;
		int k=a+b;
		System.out.println(k);
		k++;
		System.out.println(k);
		k--;
		System.out.println(k);
	}
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=6;
		c=7;
		int i=a++ + --b + ++c + c-- + ++a + b++;
		System.out.println(i);
	}
}
