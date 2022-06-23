package second.day;

public class SecondDayClassTwo {
	public static int math(int a, int b) {
		int c = a * b;
		return c;
	}
	
	public String getName(String name) {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multi = SecondDayClassTwo.math(5, 4);
		System.out.println(multi);

		
		System.out.println(SecondDayClassTwo.math(12, 12));
		System.out.println("pull request = a request for approval of our code "
				+ "from the person in charge of approval and usually it is senior SDET");

		SecondDayClassTwo name = new SecondDayClassTwo();
		String name2 = name.getName("ahamd Jan");
		System.out.println(name2);

	}

}
