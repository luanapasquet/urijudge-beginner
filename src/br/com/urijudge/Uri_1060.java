package br.com.urijudge;

import java.util.Scanner;

public class Uri_1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int posit = 0;

		while (contador < 6) {
			double n = sc.nextDouble();
			contador++;
			if (n > 0) {
				posit++;
			}
		}

		System.out.println(posit + " valores positivos");

		sc.close();

	}

}