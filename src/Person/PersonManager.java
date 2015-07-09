package Person;

public interface PersonManager {
	
	public Person createPerson(String name);
	
	public Person getPerson(String name);
	
	public void addPerson(Person person);
	
	public void removePerson(Person person);

}