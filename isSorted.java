package Ass6;
import java.util.Scanner;

public class isSorted {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare variables and arrays
		int length;
		int[] array;
		boolean sorted;
		
		//prompt a message to enter a list
		System.out.print("Enter list: ");
		//get the length
		length = input.nextInt();
		
		array = new int[length];
		
		for(int i = 0; i < array.length; i ++) {
			//enter the elements of the array
			array[i] = input.nextInt();
		}
		//call the method sorted, store in a sorted varable
		sorted = isSorted(array);
		
		if(sorted) { //if the list is sorted
			System.out.println("Your list IS sorted!");
		}
		else { //if the list isnt sorted
			System.out.println("Your list IS NOT sorted!");
		}
	}
	public static boolean isSorted(int[] list) {
		boolean sorted = true; //declare a variable for sorted
		for(int i = 0; i < list.length; i++) { //loop through the elements
				if(i < list.length - 1) { //if i is not the last element
					if(list[i] > list[i + 1]) { //if the element is greater than the next one
						sorted = false; //set sorted to false
						break; //end the loop
					}
				}
			}
		return sorted; //return the value of sorted
	}
}