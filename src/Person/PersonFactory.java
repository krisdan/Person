package Person;

import java.util.TreeSet;
import java.util.Iterator;

public class PersonFactory implements PersonManager {
	
	private static PersonFactory personFactory = null;
	
	private TreeSet<Person> people;

	private PersonFactory() {
		// Does Nothing
	}
	
	public static PersonFactory getInstancePersonFactory() {
		
		if (PersonFactory.personFactory == null) {
			
			synchronized(PersonFactory.class) {
				if (PersonFactory.personFactory == null) {
					
					PersonFactory.personFactory = new PersonFactory();
				}
			}
		}
		
		return PersonFactory.personFactory;
	}
	
	private TreeSet<Person> getPeople( ) {
		
		return this.people;
	}
	
	public Person createPerson(String name) {
		
		Person newPerson = new Person(name);
		
		this.addPerson(newPerson);
		
		return newPerson;
	}
	
	public Person getPerson(String name) {
		
		TreeSet<Person> group = this.getPeople();
		
		Person person = null;
		
		Iterator<Person> itr = group.iterator();
		
		while(itr.hasNext()) {
	         person = itr.next();
	    }
	    return person;
	}
	
	public void addPerson(Person person) {
		
		this.getPeople().add(person);	
	}
	
	public void removePerson(Person person) {
		
		this.getPeople().remove(person);	
	}

}