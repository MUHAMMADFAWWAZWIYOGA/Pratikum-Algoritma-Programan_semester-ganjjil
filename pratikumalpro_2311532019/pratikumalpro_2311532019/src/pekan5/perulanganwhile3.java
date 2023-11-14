package pekan5;

import java.util.Scanner;

public class perulanganwhile3 {
	public static void main (String [] args) { 
		int umur;
		char sim;
		String jawab= "ya";
		
		 
		while (!jawab.equalsIgnoreCase(" ya ")) {

		Scanner a=new Scanner(System.in);
		
		System.out.print("inputkan umur anda:");
		umur= scan.nextInt();
		System.out.println("apakah anda sudah punya sim c: ");
		sim=a.next().charAt(0);
		a.close();
		if ((umur >=17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh mengemudi");
		}if ((umur < 17)&&(sim!='y')) {
			System.out.println("Anda belum cukup umur bawa motor");
		}if ((umur< 17)&&(sim== 'ý')){ 
			System.out.println("anda belum cukup umur punya SIM");
		}
		System.out.print( "apakah  lanjut (ya / tidak ) ");
		jawab = scan.next();
		
		
		
		}
		
		System.out.println( "terima kasih sudah menggunakan program kami ");
		scan.close();
		}}

	


