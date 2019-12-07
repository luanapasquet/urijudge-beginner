package urijudge;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] myArray = new int [20];
		int aux = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		
		for (int i = 0; i <= 9; i++) {
			aux = myArray[i];
			myArray[i] = myArray[19-i];
			myArray[19-i] = aux;
		}
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("N[" + i + "] = " + myArray[19-1]);
		}
		
		
		sc.close();

	}

}
