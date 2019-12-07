package urijudge;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myArray = new int[10];
		int sum = 0;

		myArray[0] = sc.nextInt();
		System.out.println("N[0] = " + myArray[0]);
		for (int i = 1; i < myArray.length; i++) {
			myArray[i] = myArray[i - 1] * 2;
			sum = myArray[i];
			System.out.println("N" + "[" + i + "] = " + sum);
		}

		sc.close();
	}
}
