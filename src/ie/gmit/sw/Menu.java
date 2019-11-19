package ie.gmit.sw;

import java.util.*;

public class Menu {

	static Scanner scanner = new Scanner(System.in);

		public static void start() {
			//input for the menu
			int userInput  = 0;
	
			try {
				while (userInput != 2) {
					//keeps program running as long as not exited
					//menu header
					System.out.println("==========================================\n");
					System.out.println("--Application :JAVA Word Cloud Generator--\n");
					
					System.out.println("==========================================\n");
					System.out.println("Options found below :");
					System.out.println("===================\n");

					System.out.println("1.To parse a file \n2.To Quit Program");

					userInput = scanner.nextInt();//Ask user for input for program 
					switch (userInput) {
					//calls method for parsing the file
					case 1:
					parser.parseMenu(); // will be found in your parser 
					//exits the program through a break 
					case 2:
						break;
					default:
						System.out.println("Invalid input in menu");
					}// switch

				} // while
				
				// try and catch in Case the user enters char ,float etc instead of expected input (1 or 2)
			} catch (InputMismatchException e) {  
				System.out.println("ERROR \n Please restart Program");
				userInput = 0;
			}//catch
		}// start
	}// menu