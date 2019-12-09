package br.com.urijudge;

import java.util.Scanner;

public class Uri_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y  = sc.nextInt();
		int min, max;
		
		if (x > y) {
			max = x;
			min = y;
		} else {
			min = x;
			max = y;
		}
		int soma = 0;
		for (int i=min+1; i<max; i++) {
			if (i % 2 !=0) {
			soma = soma + i;
			}
		}
		System.out.println(soma);
		
		sc.close();
	}
}