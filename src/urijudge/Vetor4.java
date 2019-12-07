package urijudge;

import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= 10) {
				double num = array[i];
				System.out.printf("A[%d] = %.1f\n", i, num);
			}

			sc.close();

		}

	}
}
