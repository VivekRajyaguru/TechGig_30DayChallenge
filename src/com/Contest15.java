package com;

import java.util.Scanner;

public class Contest15 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int pow = sc.nextInt();
		System.out.println(getPowVal(number, pow));
		sc.close();
	}
	
	public static int getPowVal(int number, int pow) {
		if(pow == 0) {
			return number;
		} 
		if(pow == 1) {
			return number;
		} else {
			return number * getPowVal(number, pow-1);
		}
		
	}

}
