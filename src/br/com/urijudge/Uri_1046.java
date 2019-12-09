package br.com.urijudge;

import java.util.Scanner;

public class Uri_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf;
		hi = sc.nextInt();
		hf = sc.nextInt();
		int ht;
		
		if (hf < hi) {
			ht = 24 - hi + hf;
			System.out.println("O JOGO DUROU " + ht + " HORA(S)");
		} else if 
				(hf > hi) {
			ht = hf - hi;
			System.out.println("O JOGO DUROU " + ht + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		sc.close();
	}
}