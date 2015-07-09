package Person;

/*
 * Interface for the PersonFactory Class 
 */
public interface PersonManager {
	
	public Person createPerson(String name);
	
	public Person getPerson(String name);
	
	public void addPerson(Person person);
	
	public void removePerson(Person person);

}