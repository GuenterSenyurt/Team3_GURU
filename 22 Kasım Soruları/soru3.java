package pzt_22_11;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		/* Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
		 *  Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın. (Replit-Scanner 4)
		        1 şeker = 1.7 gr
				Örnek Çıktı:
				Yılda 12.41 kg şeker kullanıyor.*/


	
		Scanner scan=new Scanner (System.in);
		
		System.out.print("Günde ne kadar çay içiyorsunuz: ");
		int çay=scan.nextInt();
        
		System.out.print("Günde ne kadar şeker kulanıyorsunuz(adet olarak): ");
		int şekerSayısı=scan.nextInt();
   
   
        System.out.println("Yılda " +(şekerSayısı*çay*365*1.7)/1000+ " kg şeker kullanıyorsunuz");
  
	
	scan.close();
	
	
	
	
	
	
	}

}
