package br.com.urijudge;

import java.util.Scanner;

public class Uri_1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double av1 = sc.nextDouble();
		double av2 = sc.nextDouble();
		double av3 = sc.nextDouble();
		double media = (av1 * 2 + av2 * 3 + av3 * 5) / 10;
		System.out.printf("MEDIA = %.1f\n", media);

		sc.close();
	}
}