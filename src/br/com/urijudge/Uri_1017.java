package br.com.urijudge;

import java.util.Scanner;

public class Uri_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tgasto = sc.nextInt();
		double vmedia = sc.nextInt();
		double km = (tgasto * vmedia) / 12;
		System.out.printf("%.3f\n", km);

		sc.close();

	}
}