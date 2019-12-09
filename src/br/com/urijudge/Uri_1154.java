package br.com.urijudge;

import java.util.Scanner;

public class Uri_1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		int sum = 0;
		int cont = 0;

		while (age >= 0) {
			sum += age;
			cont++;
			age = sc.nextInt();
		}
		if (cont > 0) {
			double media = (double) sum / cont;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("impossivel calcular");
		}
		sc.close();
	}
}