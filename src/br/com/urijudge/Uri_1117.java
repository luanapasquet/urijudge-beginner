package br.com.urijudge;

import java.util.Scanner;

public class Uri_1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double soma = 0;

		while (cont != 2) {
			double n = sc.nextDouble();
			if (n >= 0 && n <= 10) {
				soma += n;
				cont++;
			} else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f%n", soma / cont);

		sc.close();
	}
	
}