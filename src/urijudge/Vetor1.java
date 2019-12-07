package urijudge;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myArray = new int[10];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] <= 0) {
				myArray[i] = 1;
				System.out.println("X" + "[" + i + "] = " + myArray[i]);
			} else {
				System.out.println("X" + "[" + i + "] = " + myArray[i]);
			}			
		}
		sc.close();
	}
}
