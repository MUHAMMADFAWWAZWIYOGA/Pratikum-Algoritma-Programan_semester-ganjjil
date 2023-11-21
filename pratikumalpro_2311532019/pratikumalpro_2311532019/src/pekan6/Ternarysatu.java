package pekan6;

import java.util.Scanner;

public class Ternarysatu {
	
	public static void main  ( String [] args ) {
		double IPK;
		Scanner input =new Scanner (System.in);
		System.out.print ("ïnputkan IPK Anda = ");
		IPK = input.nextDouble () ;
		input.close();
		String hasil = (IPK > 2.75) ?" Ända lulus sangat memuaskan ":" ända lulus memuaskan ";
		System.out.println(hasil);
	}

}
