package br.com.urijudge;

import java.util.Scanner;

public class Uri_1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i = i + 2) {
			System.out.println(i);
		}

		sc.close();
	}
}