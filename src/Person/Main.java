package Person;


public class Main {

	 
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] firstNames = {"Dan ","Chris ","Dave ","Bob ","Ben ","Steve ","Carl ","John ","Kevin ","muhammad "};
		
		String[] lastNames = new String[10];
		
		int i;
		
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
		
		String name =  "ben";
		System.out.println(name.length());
		
		Person person1 = new Person(name);
		
		Person[] people = new Person[10];
		
		 for(i = 0; i < 10; i++) {
			 
			 int fNameRef = 9 - i;
			   String firstName = firstNames[fNameRef];
			   
			   int lNameRef = 9 - firstName.length();
			   
			   String lastName = lastNames[lNameRef];
			   
			   String fullName = firstName + lastName;
			   
			   people[i] = new Person(fullName);
			 
			 

		  }
		 
		 for(Person person : people) {
			   
			   System.out.println(person.toString());
			  }for(Person person : people) {
				   
				   System.out.println(person.toString());
				  }
		
		//System.out.println(person1.name);
		
		//System.out.println(firstNames[0]+lastNames[0]);

	}

}
