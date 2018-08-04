package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustmorReflection {
	public static void main(String[] args) {
		Customer c1 = new Customer("polo");
		System.out.println(c1);

		Class cc = c1.getClass();
		System.out.println(cc);

		System.out.println("list of constructor ");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}
		System.out.println("List of Methods");
		Method[] methods = cc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		System.out.println("List of  DeclaredMethods");
		Method[] decMethods = cc.getDeclaredMethods();
		for (Method m : decMethods) {
			System.out.println(m);
		}
		System.out.println("List of Fields");
		Field[] fields = cc.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
	}

}
