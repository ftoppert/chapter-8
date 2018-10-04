package Exercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double[] arrayNums = new double [20];
	int total = 0;
	int i = 0 ;
	int avg = 0;
	int quit = 999999;
	Scanner input = new Scanner(System.in);
	while(quit != 99999) {
		System.out.print("enter a number >>> ");
			arrayNums[i] = input.nextDouble();
				total= (int) (total + arrayNums[i]);
				avg = total/arrayNums.length;
		System.out.println("Another number? to quit 99999");
		quit=input.nextInt();
	}
	System.out.println("Total: " + total);
	System.out.println("Avg: " + avg);
		
	}

}
