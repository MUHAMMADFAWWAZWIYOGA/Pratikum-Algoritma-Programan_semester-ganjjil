package Pekan2;

import java.util.Scanner;

public class CekUmur {
	
	public static void main(String[] args) {
		int umur;
		Scanner a= new Scanner(System.in);
		System.out.print("Input umur anda: ");
		umur = a.nextInt();
		a.close();
		if(umur > 17) {
			System.out.println("anda sudah dewasa");
			
		} else {
			System.out.println("Anda masih anak-anak");
		}
		
	}

}
