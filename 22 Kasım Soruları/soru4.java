package pzt_22_11;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		/* Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl 
		 * ve gün sayısına dönüştürmek için bir Java programı yazın. (Replit- Scanner 10)
		INPUT:Dakika sayısı: 3456789
		OUTPUT :3456789 dakika yaklaşık 6 yıl 210 gündür*/


	
		Scanner scan=new Scanner (System.in);

		System.out.println("Lutfen dakika giriniz:");

		int dakika=scan.nextInt();

		int toplamSaat = dakika/60;
		        int toplamGun = toplamSaat/24;
		        int toplamYıl = toplamGun/365;
		        int kalanGun = toplamGun%365;
		        System.out.println(dakika + " dakika, yaklaşık "+ toplamYıl + " yıl " + kalanGun + " gündür ");

	
	
	scan.close();
	
	
	
	
	
	
	
	
	}

}
