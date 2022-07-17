
public class ArraysAndMethods2 {

	public static void main(String[] args) {
	
	//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greet("Anthony");
		
	//write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(welcome("Good Morning","William"));
		
	//analyze the difference between these two methods - what did you find? How are they different?
		/*
		 * Both options at the top give you similar outcomes, but which you choose is based on what you're wanting to achieve.
		 * You'd want to use the return method if you're wanting to create an interface where the user inserts the information
		 * while the first method would be best if the programmer is entering the designated information. The first one will
		 * do the method while the second method will return information from outside the method.
		 */
	
	//write and test a method that takes a String and an int and returns true if the string if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Harrison", 8));
	
	//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		String[] names = {"Adam", "Eric", "Alex", "Marshall"};
		
		System.out.println(doesArrayContainString(names, "Alex"));
		
	
	}

	public static void greet(String name) {
		System.out.println("Greetings, " + name + "!");
	}
	public static String welcome(String greeting, String firstName) {
		return greeting + ", " + firstName + "!";
	}
	
	public static boolean isStringLongerThanNumber(String name, int num) {
		return name.length() > num;
	}	

	public static boolean doesArrayContainString(String[] arrayNames, String testName) {
		for (String arrayName : arrayNames) {
			if(arrayName.equals(testName)) {
				return true;}
		}
		return false;
	}
}

