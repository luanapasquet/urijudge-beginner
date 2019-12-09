package br.com.urijudge;

import java.util.Scanner;

public class Uri_1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float av1 = sc.nextFloat();
		float av2 = sc.nextFloat();
		double media = (av1 * 3.5 + av2 * 7.5) / 11;
		System.out.printf("MEDIA = %.5f\n", media);

		sc.close();
	}
}