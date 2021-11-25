package yeni;

public class Java_20_ReverseNumber {

	public static void main(String[] args) {
		
		int num = 9876358;
		int rev = 0;
		int a=0;
		while(num !=0) {
			a=num%10;
			num/=10;
			System.out.print(a);
		}
		
		//System.out.println("reversed number is "+ rev);
	}

}
