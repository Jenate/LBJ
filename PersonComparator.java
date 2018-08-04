package spider;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person arg0, Person arg1) {
		return p1.getAge() - p2.getAge();
	}

}
