package br.com.urijudge;

import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorBC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		System.out.println(maiorBC + " eh o maior");
		sc.close();

	}
}