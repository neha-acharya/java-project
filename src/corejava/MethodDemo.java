package corejava;
import java.util.Calendar;

public class MethodDemo {
public static void main1(String[] args) {
	printline(50);
	System.out.println("--------------------------------");
	System.out.println("James gosling Java");
	System.out.println("--------------------------------");
	
	System.out.println("Created at Sun Microsystems");
	printline();
	printline(20);
	printline(55,'%');
}
public static void main(String[] args) {
	int a=20,b=30;
	int c=max(a,b);
	System.out.println(c);
	System.out.println("Today is"+today());
}
public static int today(){
	Calendar c=Calendar.getInstance();
	return c.get(Calendar.DATE);
}

public static int max(int x,int y){
	if(x>y){
		return x;
	}else{
		return y;
	}
}

public static void printline(int len){
	for(int i=0;i<len;i++){
		System.out.print("-");
	}
	System.out.println();
}
public static void printline(int len,char c){
	for(int i=0;i<len;i++){
		System.out.print(c);
	}
	System.out.println();
}

public static void printline(){
	System.out.println("-----------------------------------------------");
}

}
