class ApppendStringBuilder2 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Jawa");
		sb1.append(new Person("ORACLE"));
		System.out.println(sb1);
	}
}

class Person {

	String name;
	Person(String str) { name = str; }
}