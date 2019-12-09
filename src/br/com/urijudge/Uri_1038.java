package br.com.urijudge;

import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double valor;

		switch (codigo) {
		case 1:
			valor = 4 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 2:
			valor = 4.50 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 3:
			valor = 5.0 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 4:
			valor = 2.00 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		case 5:
			valor = 1.50 * qtd;
			System.out.printf("Total: R$ %.2f%n", valor);
			break;
		}

		sc.close();

	}

}