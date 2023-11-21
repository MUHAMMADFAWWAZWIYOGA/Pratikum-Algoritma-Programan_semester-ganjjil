package pekan6;

import java.util.Scanner;

public class switchcase1 {
	
	public static void main (String [] arg ) {
		
		Scanner input  = new Scanner (System.in);
		System.out.print(" Ïnputkan PIlihan Anda (1-3) : " );
		int n = input.nextInt();
		switch (n) {
		case 1 :
		System.out.println("anda memilih anies ");
		 break;
		case 2:
		System.out.println( " anda memilih prabowo ");
		break;
		case 3:
		System.out.println( " anda memilih ganjar ");
		break;
		default:
			System.out.println( " PIlihan anda bukan nomor 1 sampai 3 ");
			System.out.println("terima kasih sudah memilih ");
		}
	}

}
