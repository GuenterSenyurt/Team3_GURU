package pzt_22_11;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
	//) Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız. 

	
		 Scanner scan=new Scanner (System.in); 
		    
		    System.out.print("Lütfen X noktasını giriniz : ");
		    int x=scan.nextInt();
		    
		    System.out.print("Lütfen Y noktasını giriniz : ");
		    int y=scan.nextInt();
		    
		    
		    if (x>0 && y>0 ) {
				System.out.println("1.bölgede");
			} else if(x<0 && y>0) {
		        System.out.println("2.bölgede");
			}else if(x<0 && y<0) {
			    System.out.println("3.bölgede");	
			}else if(x>0 && y<0) {
				System.out.println("4.bölgede");
			}else if(x==0 && y!=0) {
				System.out.println("Y ekseninde");
			}else if(x!=0 && y==0) {
				System.out.println("X ekseninde");
			}else {
				System.out.println("Orjin");
		    }
		    
		    
		    scan.close();
	
	
	
	
	
	
	
	
	
	
	}

}
