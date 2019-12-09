package br.com.urijudge;

import java.util.Scanner;

public class Uri_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	 int x, y, z, min1, min2 = 0, min3 = 0;
	       
	       
	        x = sc.nextInt();
	        y = sc.nextInt();
	        z = sc.nextInt();
	              
	        min1 = Math.min(x, Math.min(y, z));
	        if (min1 == x) {
	            min2 = Math.min(y, z);
	            min3 = Math.max(y, z);
	        }
	        if (min1 == y) {
	            min2 = Math.min(x, z);
	            min3 = Math.max(x, z);
	        }
	        if (min1 == z) {
	            min2 = Math.min(x, y);
	            min3 = Math.max(x, y);
	        }
	        System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
	        System.out.print(x + "\n" + y + "\n" + z + "\n");
	        
	        sc.close();
	}
	
}