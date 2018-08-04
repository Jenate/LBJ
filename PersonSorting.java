package spider;

import java.util.TreeSet;

public class PersonSorting {

	public static void main(String[] args) {
//		PersonComparator pc = new PersonComparator();
//		TreeSet<Person> persons = new TreeSet<>(pc);

		TreeSet<Person> persons = new TreeSet<>((p1,p2)-> p1.getAge() - p2.getAge());
		
//		TreeSet<>   new TreeSet<>()
		persons.add(new Person("polo", 21));
		persons.add(new Person("lilli", 19));
		persons.add(new Person("milli", 20));
		persons.forEach(System.out::println);
	}

}
