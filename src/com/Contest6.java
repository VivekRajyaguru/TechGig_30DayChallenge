package com;

import java.util.Scanner;

public class Contest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int counter = 0;
		while(true) {
			counter++;
			number = (number/10);
			if(number <= 0) break;
		}
		System.out.println(counter);
		sc.close();
	}
	
}
