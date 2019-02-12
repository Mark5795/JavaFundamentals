package oefening2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloFriends {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		System.out.println("What is your name? ");
		String name = input.nextLine();
		if (name.equals("Willem") || name.equals("willem")) {
			System.out.println("Goodmorning " + name + " :)");		
		}
		else {
			System.out.println("Hello " + name);
		}
		input.close();
		
		// Maakt een file aan het stopt er namen in.
		File file = new File ("C:\\Users\\Mark\\eclipse-workspace\\Week1\\bin\\oefening2\\friends.txt");
		try {
			PrintWriter printWriter = new PrintWriter(file);
		    printWriter.println("mark");
		    printWriter.println("willem");
		    printWriter.println("kees");
		    printWriter.println("jan");
		    printWriter.close(); 
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("Finished writing");	    
		
		// Lees namen uit het bestand "friends.txt" en toon ze op het scherm.
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		//Maak verschillende friends-bestanden voor verschillende mensen en lees het juiste bestand in afhankelijk
		//van de ingevoerde naam (v.b. Willem.txt, Jan.txt en Anne.txt).	
		input = new Scanner(System.in); 
		System.out.println("What is your name? ");
		name = input.nextLine();
		file = new File ("C:\\Users\\Mark\\eclipse-workspace\\Week1\\bin\\oefening2\\" + name + ".txt");
		try {
			PrintWriter printWriter = new PrintWriter(file);
		    printWriter.println("Hello and goodmorning " + name);
		    printWriter.close(); 
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		input.close();
		
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		//Schrijf de namen achterste voren naar nieuw file (Willem.txt wordt dan milleW.txt).
		//Kijk hiervoor in de APIdocumentatie van de klasse String voor geschikte methoden.
		String reversedName = new StringBuilder(name).reverse().toString();
		file = new File ("C:\\Users\\Mark\\eclipse-workspace\\Week1\\bin\\oefening2\\" + reversedName + ".txt");
		try {
			PrintWriter printWriter = new PrintWriter(file);
			String message = "Hello and goodmorning ";
			String reversedMessage = new StringBuilder(message).reverse().toString();
			printWriter.println(reversedName + reversedMessage);
		    printWriter.close(); 
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}		
	}

}
