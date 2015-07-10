package Person;

public class Person {
	
	private String name;

	public Person(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	


}
