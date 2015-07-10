package Person;

public class Person {
	
	public String name;

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {

		StringBuilder out = new StringBuilder();

		/*out.append("Class: ");

		out.append(this.getClass());

		out.append("Person: ");

		out.append(this.getName());*/

		out.append(this.name);
		
		return out.toString();
	}

}
