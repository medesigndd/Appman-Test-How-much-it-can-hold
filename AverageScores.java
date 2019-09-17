package Ass6;
import java.util.Scanner;

public class AverageScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declare variables and arrays
		double average;
		double sum = 0;
		int aboveOrEqualAverage = 0;
		int belowAverage = 0;
		double[] scores = new double[100];
		int counter = 0;
		
		//prompt user to enter the scores
		System.out.print("Enter the scores: ");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextDouble(); //enter each score
			if(scores[i] >= 0) { //if the score is a positive number
				sum += scores[i]; //add on to the sum
				counter++; //increment the counter
			}
			else { //if the score entered is a negative value
				break; //end the loop
			}
		}
		
		average = sum / counter; //calculate the average
		
		for(int i = 0; i < counter; i++) { //loop through all the scores entered
			if(scores[i] >= average) { //if the score is greater than or equal to the average
				aboveOrEqualAverage += 1; //increment the above or equal to average
			}
			else { //if the score is less than the average
				belowAverage += 1; //increment the below average
			}
		}
		
		//print out results
		System.out.printf("The average of the list is: %1.2f\n", average);
		System.out.println("The amount of numbers in the list that are equal or above the average are: " + aboveOrEqualAverage);
		System.out.println("The amount of numbers in the list that are below the average are: " + belowAverage);
	}
}
