package com;

import java.util.Scanner;

public class Contest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double principal = sc.nextDouble();
		Integer interest = sc.nextInt();
		Integer year = sc.nextInt();
		
		System.out.println(calculateSimpleInterest(principal, interest, year));
	}
	
	static Long calculateSimpleInterest(Double principal, Integer interest, Integer year) {
		return Math.round((principal * interest * year) / 100);
	}
	
}
