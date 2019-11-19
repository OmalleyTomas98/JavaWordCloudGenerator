
package ie.gmit.sw;	

import java.awt.Font;
import java.io.*;
import java.util.Scanner;

import javax.swing.text.Document;

import java.net.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parser {
	//----------------_______________________________________________---------------

	//----------------Text File being used for this example phNaE.txt---------------
	
	//----------------_______________________________________________---------------
	
	// Initialize scanner object
	static Scanner scanner =new Scanner(System.in);

	//declared Variables
	static String userFile; 
	static BufferedReader br = null;// create Buffered reader and initialize to null			 
	static int option;//user input navigate through menu 
	static int maxNumberOfChars;

	//Big O Notation Variables
	static long startTime; 
	static long endTime;

	public static void parseMenu()   {
		option = 0;

		// String for input name for file or URL
		String inputName =null;
		while (option != 3) {
			System.out.println("==========================================\n");
			System.out.println("--Application :JAVA Word Cloud Generator--\n");

			System.out.println("========================================= \n");
			System.out.println("1.Parse a File\n2.Parse a URL\n3.Return to main menu");
			option = scanner.nextInt();// input users option

			//switch statement controlled by user input held in variable named option
			switch (option) {

			//case 1 for parse File option
			case 1:
				//prompt user
				System.out.println("Enter name of file to parse(.txt) ");
				inputName = scanner.next();// input filename
				//prompt user
				System.out.println("Please enter the max number of words to be shown in Word Cloud");
				maxNumberOfChars = scanner.nextInt();// maxNumberOfChars for word cloud
				
				startTime = System.currentTimeMillis();//hold the time for big 0 notation 
				//METHOD CALL
				parseFile(inputName);
				break;
				//case 2 for parse URL option
			case 2:
				//prompt user
				System.out.println("Enter name of url to parse(www. --.com )");
				inputName = scanner.next();
				//prompt user
				System.out.println("Please enter the max number of words to be shown in Word Cloud");
				maxNumberOfChars = scanner.nextInt();// maxNumberOfChars

				// starts counter as this is the start of the buffer/encryption
				// process
				startTime = System.currentTimeMillis();
				//METHOD CALL
				parseUrl(inputName);
				break;
				//case 3 exit the program
			case 3:
				System.out.println("Exited the Program:/n");
				break;
			}
		}
	}
	public static void  parseFile(String inputName)    {

		//Validate and make sure the name of variable is stored Correctly inside of the file
		System.out.println(inputName);

		
		//preview of the file being read
		System.out.println("Preview of the file being READ");
		System.out.println("++++++++++++++++++++++++++++  ");

		//initialize the buffer reader
		BufferedReader objReader = null;
		  try {
			  //hold line from each iteration
		   String strCurrentLine;
	
		   //object reader  , reads file held by inputName variable holding path to file 
		   objReader = new BufferedReader(new FileReader(inputName));

		   //while loop to read each line in file as long as the file isnt empty(null)
		   while ((strCurrentLine = objReader.readLine()) != null) {
			   
			//in this case I will print each line in file to make sure file is being read correctly
		    System.out.println(strCurrentLine);
		   }

		   //ERROR handling to prevent file from crashing when program used  incorrectly by user
		  } catch (IOException e) {

			  //print to screen if user enters incorrect expected input 
			  System.out.println("[ERROR] No file has been found please check your spelling and try again");
		  }
		 }
	
	public static BufferedReader parseUrl(String inputName) {
		try {
			URL url = new URL(inputName);
			br = new BufferedReader(new InputStreamReader(url.openStream()));// Initialize			
			
		} catch (IOException e) {
			System.out.println("Error URL Not found");
			option = 0;
		} // catch
		return br;
	}// ParseFile
	

}// TextParser