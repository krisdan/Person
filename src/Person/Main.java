package Person;

import java.util.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * JAVA VARIABLE INITIALISATION AND OBJECT INSTANCIATION.
		 */

		/*
		 * VARIABLE INITIALISATION.
		 */

		/*
		 * Declare an empty String variable.
		 */
		String exerciseTitle;

		/*
		 * Assign a value to the exerciseTitle variable.
		 */
		exerciseTitle = "Java Variable initialisation and Object instanciation.";

		/*
		 * Create a variable to hold a new line value.
		 */
		String newLine = System.getProperty("line.separator");
		
		

		/*
		 * Output The Title of the exercise.
		 */
		System.out.println(exerciseTitle);
	
		
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);
		
		//this prints a line on screen to separate the sections
				System.out.println("------------------------------------------------------");

		/*
		 * Declare a String and assign it a value in a primitive style.
		 */
		String name = "john";
		
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);

		/*
		 * Although Strings are often initialised in a similar way to primitive
		 * values, in the background, Java instantiates a String Object. Objects
		 * can have messages (Methods) which make them very usable and useful.
		 * Here is an example of a String object message.
		 * 
		 * String.length() returns an integer representation of the number of
		 * characters in the string.
		 */

		int numCharacters = name.length(); // Create an int (Primitive) variable
											// and assign it the value returned
											// by String.length();

		/*
		 * Output the number of characters to Standard.out
		 */
		System.out.println("the name " + name + " has " + numCharacters + " characters.");

		/*
		 * Create a string object using the String class.
		 */
		String surName = new String("Smith");

		/*
		 * Concatenate name and surname into one String.
		 */
		String personName = name + " " + surName;

		/*
		 * Create a Person Object and pass it the personName variable.
		 */
		Person person1 = new Person(personName);

		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);
		
		//this prints a line on screen to separate the sections
		System.out.println("------------------------------------------------------");
		
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);

		/*
		 * Output the value of the name attribute of the Person object person1.
		 */
		System.out.println("person1 name: " + person1.name);

		/*
		 * Like Strings Arrays are Objects but can be instantiated in shorthand
		 * that is similar to primitive type initialisation. They like Strings
		 * can also use Class instantiation.
		 */

		/*
		 * Declare initialise and fill a String Array in shorthand.
		 */
		String[] firstNames = { "Dan", "Chris", "Dave", "Bob", "Ben", "Steve",
				"Carl", "John", "Kevin", "muhammad" };

		/*
		 * Declare and initialise an empty String Array that can hold 10 Strings
		 * using instantiation.
		 */
		String[] lastNames = new String[10];

		/*
		 * Assign Values to a String Array by element key reference.
		 */
		lastNames[0] = "Perkins";
		lastNames[1] = "Smith";
		lastNames[2] = "Jones";
		lastNames[3] = "Schmidt";
		lastNames[4] = "Sing";
		lastNames[5] = "Thorpe";
		lastNames[6] = "Watts";
		lastNames[7] = "Evans";
		lastNames[8] = "Jenkins";
		lastNames[9] = "Green";

		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);
		
		//this prints a line on screen to separate the sections
		System.out.println("------------------------------------------------------");
				
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);

		/*
		 * Output the 6th name in the lastNames Array using element key
		 * reference.
		 */
		System.out.println("the 6th last name is " + lastNames[5]);
		
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);
		
		//this prints a line on screen to separate the sections
		System.out.println("------------------------------------------------------");
		
		/*
		 * Add in a carriage return or new line.
		 */
		System.out.println(newLine);

		/*
		 * Set upper and Lower limits for Random number Generation.
		 */
		int low = 0;
		int high = 9;

		/*
		 * Declare and initialise an empty Array that can hold 10 Person
		 * Objects.
		 */

		Person[] people = new Person[10];

		/*
		 * Declare an int to be used as a counter variable in a for loop, but
		 * leave un-initialised.
		 */
		int i;

		/*
		 * This for Loop will execute the code in its body 10 times sequentially
		 * and increase the value of i by one each time it runs.
		 */
		for (i = 0; i < 10; i++) {

			// Generate Random number
			Random r = new Random();
			int ranNum = r.nextInt(high - low) + low;

			// the int fnameref has the value of ranNum assigned to it.
			int fNameRef = ranNum;
			
			//the string firstName has the value of firstNames assigned to it and the value of firstNames is calculated by fnameRef.
			String firstName = firstNames[fNameRef];

			// the int lNameRef is assigned a value that is 9 less than the length of the characters of the firstName.
			int lNameRef = 9 - firstName.length();

			//the string lastName is assigned the value of lastNames the value of which is calculated by lnameRef.
			String lastName = lastNames[lNameRef];

			//the string full name is assigned the value of firstName and lastName and a space between the two.
			String fullName = firstName + " " + lastName;

			//people is assigned the value of fullName which is specified by the value of i.
			people[i] = new Person(fullName);
		}
		
		
		/*
		 * declare an int to be used as a counter variable for the for loop and give it the value 1.
		 */
		int count = 1;
		
		/*
		 * this for loop will run 10 times sequentially and print to screen each time the word name then the value of count then a : then 
		 * the value of person which is the full name, each time the code in the loop is executed the value of count is increased by 1.
		 */
		for (Person person : people) {

			System.out.println("Name " + count + " : " + person.toString());
			count++;
		}
	}

}
