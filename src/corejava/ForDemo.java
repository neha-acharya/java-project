package corejava;

public class ForDemo {
	public static void main1(String[] args) {
		for(int i=1;i<=50;i++){
			if(i%2!=0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
			 count++;
			}
			
			}
			if(count==0)
				System.out.println(i);	
		}
	}

}
