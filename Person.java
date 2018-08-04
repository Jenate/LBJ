package spider;

public class Person implements Comparable<Persons> {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name: " + name + "\tAge: " + age;

	}
	public int getAge()
	{
		return age;
	}
	
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
}
