package Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		
		Person bob = new Person("Bob");
		
		System.out.println(bob.toString());
	}

}
