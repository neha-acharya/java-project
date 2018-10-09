package corejava;

public class sumofdig {
	public static void main(String[] args) {
		int i=257;
		int j,k,sum=0;
		while(i>0){
			i=i%10;
			k=i/10;
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

}
