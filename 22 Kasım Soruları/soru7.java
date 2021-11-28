package pzt_22_11;

import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		/*Char değişken yanıtının değerini test eden ve aşağıdaki 
		 işlemleri gerçekleştiren bir switch ifadesi yazın. (Replit – If_Switch_Ternary_StringMethods 4)
		 
		 yanıt a ise,"Talebiniz işleniyor" mesajı yazdırılır 
		 yanıt b ise,"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
		 yanıt c ise,"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır.
		 başka herhangi bir yanıt değeri için,"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır.*/  


		 Scanner scan=new Scanner(System.in);

		    System.out.print("Cevap : ");	
		    String cevap=scan.next();
		    
		    switch(cevap){
		   
		      case "a":
		     System.out.println("Talebiniz işleniyor");
		     break;
		      case "b":
		     System.out.println("Yine de ilgilendiğiniz için teşekkür ederiz.");
		     break;
		      case "c":
		     System.out.println("Üzgünüz, şu anda herhangi bir yardım yok.");
		     break;
		      default:
		     System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
	
		    }
	
	
	scan.close();
	
	
	}

}
