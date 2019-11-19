----------------------------------------------------------------
	README FILE 
----------------------------------------------------------------

 Author    : Tomas O'Malley (G00361128)@gmit.ie
 Program   : Java Word Cloud
 Course    : Software Development ,Year 2, Data Structure and Algorithms 
 Weighting : 50% 
 Due Date  : 22nd of April 12:00AM

Project Description: Create a word cloud for the module Data Structures and algorithms as part of our 50% continuous Assessment.
The application uses a command line menu interface to allow the user to interact with the program.
The aim of the program is to allow the user to generate a word cloud from a URL/file inputted into the command line.The user will be prompted 1.for file and 2. for a URL
,The user will also be prompted to enter the number of words the generator should account for.
Finally the file will be parsed and a PNG will be added to his/her desktop saved as myWordCloud with the extension (PNG).

 +++ Features +++
	-command line interface   menu 
	-Parse a file 
	-Parse a URL 
	-Create and save a wordCloud as a PNG FILE
----------------------------
Program Packaging break down 
----------------------------

Contents found in g00361128 JAVA Project 
-wordCloud.jar

Jar file holds/compresses  all the contents such as classes,packages,txt files etc as one to be easily 
executed.

PACKAGE
-------------------
package .
gmit.sw.ie 
-------------------


CLASSES
-------------------

		-Menu.java
Menu prompts  and allows  the user to navigate through the application eg output in program :

==========================================

--Application :JAVA Word Cloud Generator--

==========================================

Options found below :
===================

1.To parse a file 
2.To Quit Program

The user must press 1(To parse a file) or 2 (To Quit Program) After entering for eg 
(1) here is sample output
++++++++++++++++++++++++++++++

========================================= 

1.Parse a File
2.Parse a URL
3.Return to main menu
1
Enter name of file to parse(.txt) 
phNaE.txt

Please enter the max number of words to be shown in Word Cloud
1
1phNaE.txt
Preview of the file being READ


	-parser.java
The parser class is the brains of the application that parses the users input and creates the png.

	-Runner.java
The runner holds the only main method within the application and allows the program to run.The runner just holds the menu function and nothing else.

	
(txt* files)
	-ig.txt
===========
ig.txt contains all the words for the reader to ignore when outputting the word cloud to the users screen.
===========
	-phNaE.txt
============
Named (phNaE.txt) for testing purposes quicker than typing 	PoblachtNaHEireann through every iteration of testing the project for errors.Holds the words I will be parsing in this program.
============
	-README.txt :)
============
The file you are reading which documents and explains the fundamental/core features and obstacles found in the java project.
===========

