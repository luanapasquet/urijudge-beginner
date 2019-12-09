package br.com.urijudge;

import java.util.Scanner;

public class Uri_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id, anos, meses, dias, mod;
		id = sc.nextInt();
		anos = id / 365;
		mod = id % 365;
		meses = mod / 30;
		dias = mod % 30;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)\n", anos, meses, dias);

		sc.close();
	}

}