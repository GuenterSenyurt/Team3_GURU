package pzt_22_11;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		/* Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen
		 *  formata ceviren java kodunu yaziniz. (Replit – If_Switch_Ternary_StringMethods 2)
		Input : John White  1234234534561478
		Output : Name : J* W**   CCN : ** ** **** 1478     * Ilk Harfler Buyuk harf ile baslamalidir.*   */

    Scanner scan=new Scanner(System.in);
	
	System.out.print("Lütfen isminizi giriniz : ");
	String isim=scan.nextLine();
	
    System.out.print("Lütfen soyisminizi giriniz : ");
	String soyİsim=scan.nextLine();
	
	System.out.print("Lütfen 16 haneli kart numaranızı giriniz : ");
	String kartNo=scan.nextLine();
	
	isim=isim.toUpperCase().charAt(0) +isim.substring(1).replaceAll("\\w", "*");
	System.out.print(isim);
	
	System.out.println(" ");
	soyİsim=soyİsim.toUpperCase().charAt(0) +soyİsim.substring(1).replaceAll("\\w", "*");
	System.out.print(soyİsim);
	
	System.out.println(" ");
	
	kartNo=kartNo.replaceAll("\\s", "").substring(0,12).replaceAll("\\d", "*")+kartNo.substring(12);
	kartNo=kartNo.substring(0,4)+" "+kartNo.substring(4,8)+" "+kartNo.substring(8,12)+" "+kartNo.substring(12);
	System.out.println(kartNo);
	
	
	scan.close();
	
	
	
	
	
	}

}
