package javaudemy;

class Deepan

{

	String name;
	int age;

	void record() {

		System.out.println("My Name is " + name + " and my age is " + age + " ");

	}

}

public class MethodsObjects {

	public static void main(String[] args) {

		Deepan person = new Deepan();

		person.name = "deepan";
		person.age = 29;

		person.record();

		Deepan person2 = new Deepan();

		person2.name = "karthi";
		person2.age = 28;

		person2.record();

		// TODO Auto-generated method stub

	}

}
