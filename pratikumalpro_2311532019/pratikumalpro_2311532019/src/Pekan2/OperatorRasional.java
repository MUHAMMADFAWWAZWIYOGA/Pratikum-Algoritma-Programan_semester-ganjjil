package Pekan2;

import java.util.Scanner;

public class OperatorRasional {
	
	public static void main(String[] args) {
		int A2;
		int A1;
		boolean hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.println();
		System.out.print("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("INput angka-2");
		A2 = keyboard.nextInt();
		hasil = A1> A2 ; // apakah lebih besar A2?
		System.out.println ("A1 > A2 = " + hasil);
		hasil = A1 < A2; // apakah A1 lebih kecil dari A2 ?
		System.out.println("A1 < A2 = "+ hasil);
		hasil = A1 >= A2;
		//apakah A1 lebih besar sama dengan A2?
		System.out.println("A1 >= A2 = " +hasil);
		hasil = A1 <+ A2;
		// apakah A1 lebih kecil sama dengan  A2?
		System.out.println("A1 <= A2 = " + hasil);
		hasil = A1 == A2;
		//apakah A1 sama dwngan A2 ?
		System.out.println("A1== A2 = " + hasil);
		hasil = A1 != A2;
		// apakah A1 tidak sama dengan A@ ? 
		System.out.println("A1 != A2 = " + hasil);
		
		keyboard.close();
				
		
		
				
				
	}

}
