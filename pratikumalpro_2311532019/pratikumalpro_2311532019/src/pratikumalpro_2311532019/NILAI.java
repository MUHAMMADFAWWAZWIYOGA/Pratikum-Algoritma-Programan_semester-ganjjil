package pratikumalpro_2311532019;

import java.util.Scanner;

public class NILAI {
	
	public static void main(String[] arg) {
		int nilai;
		Scanner input=new Scanner (System.in);
				System.out.print("inputkan nilai anda: ");
				nilai=input.nextInt();
				input.close();
				
						
		if (nilai>=81) {
			System.out.println("A");
		}
		else if (nilai >=70) {
			System.out.println("B");} 
		
			else if (nilai >= 60){
		System.out.println("C");}
			
		else if (nilai >=50){
		System.out.println("D");}
		
	        else {
		System.out.println("E");}
		
		
		}
	}


