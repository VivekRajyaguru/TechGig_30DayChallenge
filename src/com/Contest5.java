package com;

import java.util.Scanner;

public class Contest5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int sum = 1;
		for(int i=1; i <= value; i++){
			sum =  (i * (sum));
		}
		System.out.println(sum);
		sc.close();
	}

}
