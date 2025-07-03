package bcci.main;

import java.util.Scanner;

import bcci.ipl.Service.IplService;

//task 3 
public class Main {

	public static void main(String[] args) {
		IplService obj = new IplService();

		while(true) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			
			System.out.println("\n1. Get the details of specific Teams");
			System.out.println("\n2. Get the details of All Teams");
			System.out.println("\n3. Names of Eliminated Teams");
			System.out.println("\n4. Names of non eliminated teams");
			//System.out.println("\n5. Team ranking based on NRR");
			System.out.println("\n5. Exit");
			System.out.println("\n*Enter your choice: ");
			try {
				int choice = sc.nextInt();
				switch(choice) {
				
				case 1 :				
					System.out.println("Enter the name of team in short to get the details : ");
					String team = sc.next().toUpperCase();
					obj.printSpecificDetails(team);
					break;
				
				case 2 :
					obj.getdetails();
					break;
					
				case 3:
					System.out.println("Names of Eliminated Teams-->");
					obj.Eliminated();
					break;
					
				case 4:
					System.out.println("Names of NON Eliminated Teams-->");
					obj.NONEliminated();;
					break;
					
				case 5:
					System.out.println("Exiting.....");
					return;
					
				default:
					System.out.println("Invalid choice");

				}
			}
			catch(Exception e) {
				System.err.println("Exception!! Invalid input Enter valid input of type Integer only");
				sc.nextLine();
			}
			
		}
	}
}
