package pzt_22_11;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		/* Kullanıcıdan aldığı ürünün adedini ve liste fiyatını alin, kullanıcıya
		 -müşteri kartı olup olmadığını sorun,
		 -Müşteri kartı varsa ve 10 üründen fazla alırsa %20, yoksa %15 indirim yapın. 
		 -Müşteri kartı yoksa ve 10 üründen fazla alırsa %15, 10 üründen az alırsa %10 indirim yapın. */

	

		    Scanner scan=new Scanner (System.in); 
		    
		    System.out.print("Lütfen ürün adedini giriniz : ");
		    int ürün=scan.nextInt();
		    
		    System.out.print("Lütfen liste fiyatını giriniz : ");
		    double fiyat=scan.nextDouble();
		    double toplamFiyat;
		    
		    System.out.print("Musteri kartiniz var mi? Varsa 1 yoksa 2 tusuna basiniz ");
	
	   
		 int kart=scan.nextInt();
		    
		 if (kart==1) {
			if (ürün>10) {
				fiyat=fiyat*0.80;
				toplamFiyat=fiyat*ürün;
				System.out.println("Tebrikler.%20 indirim hakkı kazandınız.Toplam ödemeniz gereken tutar : " + toplamFiyat);
			} else {
				fiyat=fiyat*0.85;
				toplamFiyat = fiyat*ürün;
				System.out.println(" Tebrikler.%15 indirim hakki kazandınız.Toplam ödemeniz gereken tutar : " + toplamFiyat);
								
			}
		}else if(kart==2) {
			if (ürün>10) {
				fiyat=fiyat*0.85;
				toplamFiyat=fiyat*ürün;
				System.out.println("Tebrikler.%15 indirim hakkı kazandınız.Toplam ödemeniz gereken tutar : " + toplamFiyat);
			
			
		}else{
			fiyat = fiyat - fiyat*0.90;
			toplamFiyat = fiyat*ürün;
			System.out.println("Tebrikler.%10 indirim hakkı kazandınız. Toplam ödemeniz gereken tıutar  : " + toplamFiyat);
		}
		}else{
			System.out.println("Yanlış giriş yaptınız.");
		}
		
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
