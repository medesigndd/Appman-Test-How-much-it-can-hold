package Ass12;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare variable for the input values
		int inputNum;
		
		//declare 3 ArrayLists
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> unionList = new ArrayList<Integer>();
		
		//prompt a message to enter 5 items for the first list
		System.out.print("Enter 5 items for list 1: ");
		for(int i = 0; i < 5; i++) {
			//input them
			inputNum = input.nextInt();
			//add to the list
			list1.add(inputNum);
		}
		
		//prompt a message to enter 5 items for the first list
		System.out.print("Enter 5 items for list 2: ");
		for(int i = 0; i < 5; i++) {
			//input them
			inputNum = input.nextInt();
			//add to the list
			list2.add(inputNum);
		}
		
		//set one of the ArrayLists equal to the union method
		unionList = union(list1, list2);
		
		//print out the unionized list
		System.out.println(unionList.toString());
	}
	public static ArrayList<Integer> union(ArrayList<Integer>list1, ArrayList<Integer>list2) { //method to create the unionized list
		//declare an ArrayList
		ArrayList<Integer> unionList = new ArrayList<Integer>();
		//declare 2 variables to hold the values for each list
		int list1Value;
		int list2Value;
		
		for(int i = 0; i < list1.size() && i < list2.size(); i++) { //loop through each element
			//set the 2 value variables equal to the value of index i in each
			list1Value = list1.get(i);
			list2Value = list2.get(i);
			
			if(!unionList.contains(list1Value)) { //if the list doesn't contains the current value in list1
				unionList.add(list1Value); //add it
			}
			
			if(!unionList.contains(list2Value)) { //if the list doesn't contains the current value in list2
				unionList.add(list2Value); //add it
			}
		}
		return unionList; //return the list
	}
}
