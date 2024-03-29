package equals;

import java.util.Objects;

public class Person {

	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	@Override
	public boolean equals(Object anotherPerson) {// Could use autogenerated equals as well
		if( anotherPerson == this ) return true; // Optimization
		if (!(anotherPerson instanceof Person )) return false; // instanceof returns false for null parameter so no need for null check
		Person other = (Person) anotherPerson;
		return this.name.equals(other.name) && this.age.equals(other.age);
	}

	@Override
	public int hashCode() {
		// Objects.hash(name, age); // One implementation, but may have poor performance
		
		// Another option, call Boxed type hashcode() method for primitive variables.
		int result = name.hashCode();
		result = 31 * result * age.hashCode(); 
		return result;
		
		// you can save the hashcode to an instance variable if the object in immutable 
	}
	
	
	
}
