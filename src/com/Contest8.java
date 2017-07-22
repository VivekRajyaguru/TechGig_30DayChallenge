package com;

import java.util.Scanner;

public class Contest8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int totalSum = 0,temp = number, qbNum = 0;
		while(number>0) {
			qbNum = number%10;
			number = number/10;
			totalSum += (qbNum * qbNum * qbNum);
		}
		System.out.println(temp== totalSum ? "True" : "False");
		sc.close();
	}

}
