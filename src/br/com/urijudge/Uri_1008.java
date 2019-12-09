package br.com.urijudge;

import java.util.Scanner;

public class Uri_1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ch = sc.nextInt();
		double vh = sc.nextDouble();
		double salary = ch * vh; 
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f\n", salary);

		sc.close();

	}
}