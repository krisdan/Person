package Person;
import java.util.*;

public class Main
{

	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		
		/*
		 * JAVA VARIABLE INITIALISATION 
		 * AND OBJECT INSTANCIATION.
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
		 * Declare a String and assign it a value in a primitive style.
		 */
		String name = "john";
		
		/*
		 * Although Strings are often initialised in a similar way to
		 * primitive values, in the background, Java instanciates a String Object.
		 * Objects can have messages (Methods) which make them very usable 
		 * and useful. Here is an exmple of a String object message. String.length()
		 * returns an integer representation of the number of characters in the string.
		 */

		int numCharacters = name.length(); // Create an int (Primitive) variable and assign it the value returned by String.length();
		
		/*
		 * Output the number of characters to Standard.out
		 */
		System.out.println("name has " + numCharacters + " characters.");

		/*
		 * Create a string object using the String class.
		 */
		String surName = new String("Smith");
		
		/*
		 * Concatenate name and surname into one String.
		 */
		 String personName = name + " " + surName;
		 
		Person person1 = new Person(name);

		//System.out.println(person1.name);

		String[] firstNames = {"Dan","Chris","Dave","Bob","Ben","Steve","Carl","John","Kevin","muhammad"};

		String[] lastNames = new String[10];

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
		
		System.out.println(lastNames[5]);

		int i;

		/*
		 * Set upper and Lower limits for
		 * Random number Generation.
		 */
		int low = 0;
		int high = 9;

		Person[] people = new Person[10];

		for (i = 0; i < 10; i++)
		{

			// Generate Random number
			Random r = new Random();
			int ranNum = r.nextInt(high - low) + low;

			int fNameRef = ranNum;
			String firstName = firstNames[fNameRef];

			int lNameRef = 9 - firstName.length();

			String lastName = lastNames[lNameRef];

			String fullName = firstName + " " + lastName;

			people[i] = new Person(fullName);
		}

		int count = 1;
		for (Person person : people)
		{

			System.out.println("Name " + count + " : " + person.toString());
			count ++;
		}
	}

}
