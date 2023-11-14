package pekan5;

import java.util.Scanner;

public class perulanganwhile {
		public static void man (String [] args) {
			// buat variabel
			int counter = 0 ;
			String jawab ;
			boolean running = true ;
			// deklarasi scanner 
			
			try (Scanner scan = new Scanner(System.in)) {
				while (running) {
					counter++;
					System.out.println("jumlah + "+ counter);
					System.out.print("äpakah lanjut (ya/tidak?");
					jawab = scan.nextLine();
					//cek jawab  , jika tidak maka perulangan berhenti 
					if (jawab.equalsIgnoreCase("tidak")) {
						running = false ;
						
						
					}
				}
			}
			System.out.println("ända sudah melakukan perulangan sebanyak " +counter+"kali ");
		}
}
