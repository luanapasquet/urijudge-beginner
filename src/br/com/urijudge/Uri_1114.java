package br.com.urijudge;

import java.util.Scanner;

public class Uri_1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		int pw = sc.nextInt();
		while (pw != senha) {
			System.out.println("Senha Invalida");
			pw = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}