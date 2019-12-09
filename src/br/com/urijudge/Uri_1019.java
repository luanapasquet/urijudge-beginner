package br.com.urijudge;

import java.util.Scanner;

public class Uri_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, hrs, min, seg, mod;

		N = sc.nextInt();
		hrs = N / 3600;
		mod = N % 3600;
		min = mod / 60;
		seg = mod % 60;
		System.out.println(hrs + ":" + min + ":" + seg);

		sc.close();

	}

}