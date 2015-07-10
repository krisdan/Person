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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder out = new StringBuilder();
		
		String newLine = System.getProperty("line.separator");
		
		out.append("Class: " + this.getClass().getSimpleName());
		
		out.append(newLine);
		
		out.append("Name: " + this.getName());
		
		out.append(newLine);
		
		out.append("-------------------------------------------------");
		
		
		return  out.toString();
	}

	
	
	
	


}
