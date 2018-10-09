package corejava;

public class ifdemo {
	public static void main(String[] args) {
		int marks = 50;
		if (marks > +75) {
			System.out.println("Distinction");
		} else if (marks >= 60) {
			System.out.println("First Class");
		} else if (marks >= 50) {
			System.out.println("Second class");
		} else if (marks >= 40) {
			System.out.println("third class");
		} else {
			System.out.println("failed");
		}
	}

}
