package com;

import java.util.Scanner;

public class Contest17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ary[] = new int[size];
		for(int i=0; i< ary.length; i++) {
			ary[i] = sc.nextInt();
		}
		int sumCheck = sc.nextInt();
		boolean flag = false;
		for(int i=0; i< ary.length; i++) {
			for (int j=i+1; j< ary.length; j++){
				if(sumCheck ==  (ary[i] + ary[j])){
					flag = true;
				}
			}
		}
		System.out.println(flag ? "True" : "False");
		sc.close();
	}
	
}
