package com;

import java.util.Scanner;

public class Contest9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int pow = getPow(number);
		double sum = getTotalSum(number, pow);
		System.out.println(number == sum ? "True" : "False");
		sc.close();
	}
	
	public static int getPow(int number) {
		int pow = 0;
		while(number > 0){
			number = number/10;
			pow++;
		}
		return pow;
	}
	
	public static double getTotalSum(int number, int pow) {
		double total = 0;
		while(number > 0) {
			total += Math.pow(number%10, pow);
			number = number/10;
		}
		return total;
	}

}
