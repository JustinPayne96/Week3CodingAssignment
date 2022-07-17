package week3Lab1;

import java.lang.reflect.Array;

public class ArraysAndMethods1 {

	public static void main(String[] args) {
		
		//create an array with the following values 1, 5, 2, 8, 13, 6
			int[] numbers = new int[6];
			numbers[0] = 1;
			numbers[1] = 5;
			numbers[2] = 2;
			numbers[3] = 8;
			numbers[4] = 13;
			numbers[5] = 6;
		/*
		 *  int[] numbers = {1, 5, 2, 8, 13, 6}; -also works and will make less lines
		 */
			
		// print out the first element in the array
		System.out.println(numbers[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length - 1]);
		
		//print out the element in the array at position 6. What happens?
		/*
		 * System.out.println(number[6]);
		 * System gives error due to index being outside of the array.
		 */
		
		//print out the element in the array at position -1. What happens?
		/*
		 * System.out.println(numbers[-1]);
		 * System will give error due to index being outside of the array like with 6.
		 */
		
		//write a traditional for loop that prints out each element in the array
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);}
		
		//write an enhanced for loop that prints out each element in the array
		for(int number : numbers) {
			System.out.println(number);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
		//create a new variable called average and assign the average value of the array to it
		double avg = sum / numbers.length;
		
		System.out.println(avg);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int number : numbers) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}
			
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		//calculate the sum of all the letters in the new array
		int sumNames = 0;
		for(String name : names) {
			sumNames += name.length();
		}
		System.out.println(sumNames);
		
	}

}
