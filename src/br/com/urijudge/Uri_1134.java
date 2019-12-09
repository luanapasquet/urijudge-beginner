package br.com.urijudge;

import java.util.Scanner;

public class Uri_1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gasolina = 0;
		int diesel = 0;
		int alcool = 0;
		int x;

		x = sc.nextInt();

		while (x != 4) {
			if (x == 1) {
				alcool++;
			} else if (x == 2) {
				gasolina++;
			} else if (x == 3) {
				diesel++;
			}
			x = sc.nextInt();
		}

		if (x == 4) {
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
		}

		sc.close();
	}
}