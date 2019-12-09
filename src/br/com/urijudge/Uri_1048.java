package br.com.urijudge;

import java.util.Scanner;

public class Uri_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double reajuste, nsalario;
		double salario = sc.nextDouble();

		if (salario >= 0.00 && salario <= 400.00) {
			reajuste = salario * 0.15;
			nsalario = reajuste + salario;
			System.out.printf("Novo salario: %.2f%n", nsalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salario >= 400.01 && salario <= 800.00) {
			reajuste = salario * 0.12;
			nsalario = reajuste + salario;
			System.out.printf("Novo salario: %.2f%n", nsalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salario >= 800.01 && salario <= 1200.00) {
			reajuste = salario * 0.10;
			nsalario = reajuste + salario;
			System.out.printf("Novo salario: %.2f%n", nsalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			reajuste = salario * 0.07;
			nsalario = reajuste + salario;
			System.out.printf("Novo salario: %.2f%n", nsalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		} else if (salario >= 2000.01) {
			reajuste = salario * 0.04;
			nsalario = reajuste + salario;
			System.out.printf("Novo salario: %.2f%n", nsalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");

			sc.close();
		}
		
	}
	
}