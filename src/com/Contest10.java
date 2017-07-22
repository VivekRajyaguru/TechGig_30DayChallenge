package com;

import java.util.Scanner;

public class Contest10 {
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int arySize = sc.nextInt();
		int check = 0, ans = 0,num = 0;
		for(int i = 0; i < arySize-1 ; i++) {
			num = sc.nextInt();
			if(num > check) {
				check = num;
				ans = check;
			}
		}
		System.out.println(ans);
		sc.close();
	}
	
	
	

}
