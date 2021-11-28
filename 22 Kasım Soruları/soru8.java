package pzt_22_11;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		/* Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Replit - For_while 9)
           Input :1238       Output : Girilen Numananın Tersi: 8321          (Mülakat Sorusu) */


	
		Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen tersine çevrilmesi için bir sayi giriniz : ");
        int sayı = scan.nextInt();
 
      while(sayı != 0)
        {
            System.out.print(sayı%10);
            sayı/=10;
        }
	
	
	scan.close();
	
	
	
	
	
	}

}
