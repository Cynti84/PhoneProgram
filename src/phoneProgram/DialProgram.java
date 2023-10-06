package phoneProgram;

import java.util.Scanner;

public class DialProgram {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n\n0: Sh 20 (30Min, 3hrs)");
		System.out.println("1: Sh 50 (40Mins + 50SMS, 24hrs");
		System.out.println("2: Okoa Easy Sh 500 (500Mins, 7days)");
		System.out.println("3: Okoa 500");
		System.out.println("4: Okoa 250");
		System.out.println("5: Okoa 100");
		System.out.println("6: Okoa 50");
		System.out.println("7: Okoa 20");
		System.out.println("8: Okoa 10");
		System.out.println("98: More");
		
		System.out.print("Select an option: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 0:
			openWindow();
			
			break;
		case 1:
			// body for case 1
			break;
		case 2:
			// body for case 2
			break;
		case 3:
			// body for case 3
			break;
		case 4:
			// body for case 4
			break;
		case 5:
			// body for case 5
			break;
		case 6:
			// body for case 6
			break;
		case 7:
			// body for case 7
			break;
		case 8:
			// body for case 8
			break;
		case 98:
			// body for case 98
			break;
		 default:
             System.out.println("\n\nInvalid choice. Try again.");
             
		   }
		
		}
		
	}
	
		private static void openWindow() {
			Scanner scan = new Scanner(System.in);
			while(true) {
			System.out.println("\n\nExisting Unpaid Okoa: 0");
			System.out.println("New Okoa request: 20");
			System.out.println("TOTAL DEBT will be: 20");
			System.out.println("1: Accept");
			System.out.println("2: Decline");
			System.out.println("0: BACK  00: HOME");
			
			System.out.print("Select an option: ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				//body for case 1
				break;
			case 2:
				//body for case 2
			case 0 & 00:
				return;
			default:
                System.out.println("\nInvalid choice. Try again.");
                                
				}
							
			}		
			
		}

	}


