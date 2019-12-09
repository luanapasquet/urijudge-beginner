package br.com.urijudge;

import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double vlr1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double vlr2 = sc.nextDouble();
		double total = (qtd1 * vlr1) + (qtd2 * vlr2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		sc.close();

	}
}