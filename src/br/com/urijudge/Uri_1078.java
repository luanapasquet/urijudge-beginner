package br.com.urijudge;

import java.util.Scanner;

public class Uri_1078 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int mult = 0;

			if (N >= 2 && N <= 1000) {
				for (int i = 1; i < 11; i++) {
					mult = N * i;
					System.out.println(i + " x " + N + " = " + mult);
				}
				
			}

			sc.close();
	}
	
}
