package Exercises;

import java.util.Scanner;

public class ArrayMethodDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// part 1 & 2
		int[] numArrays = {1,2,3,4,5,6,7,8,9,10};
		int[] sum = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		int i = 0 ;
		int avg = 0;
		int quit = 999999;
		Scanner input = new Scanner(System.in);
		
		String[] stringArray = {"This ", " is " , " a " , " string ", " array"};
		System.out.println("Print numbers first to last");
		for(int i1 = 0; i1 < numArrays.length; i1++) {
			System.out.println("numbers in order "+numArrays[i1]);
		}
		System.out.println("Print number last to first");
				for(int j = 9 ; j >= 0; j--) {
					System.out.println("numbers in reverse order " + numArrays[j]);
		}
				for(int z = 0; z<stringArray.length; z++) {
					System.out.print(stringArray[z]);
		}
			//part 3
				
				int  total1 = 0;
				System.out.println("Sum of all of the numbers is");

				for(int i1 = 0; i1 < sum.length; i1 = i1 + 1) {
					System.out.println( sum  [i1]);
					total1 = total1 + sum [i1];
		}
					
					double[][] newInt = null;
					//part 5
					double[] arrayNums = newInt[10];
					while(quit != 999) {
						System.out.print("enter a number >>> ");
						arrayNums[i] = input.nextDouble();
							total1= (int) (total1 + arrayNums[i]);
							avg = total1/arrayNums.length;
								System.out.println("Another number? to quit 999");
									quit=input.nextInt();
		}
									System.out.println("Total: " + total1);
									System.out.println("Avg: " + avg);
					
		}
		}

