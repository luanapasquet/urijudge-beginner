package br.com.urijudge;

import java.util.Scanner;

public class Uri_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		double sfix = sc.nextDouble();
		double sells = sc.nextDouble();
		double sfinal = sfix + (sells * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", sfinal);

		sc.close();

	}
}