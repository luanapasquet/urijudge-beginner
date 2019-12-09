package br.com.urijudge;

import java.util.Scanner;

public class Uri_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		double pi = 3.14159;
		double vol = (4/3.0) * pi * Math.pow(raio, 3.0);
		System.out.printf("VOLUME = %.3f%n", vol);
		
		sc.close();

	}

}
