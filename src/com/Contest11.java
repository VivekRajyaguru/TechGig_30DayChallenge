package com;

import java.util.Scanner;

public class Contest11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int upperCase = 0, loweCase = 0;
		for(int i = 0; i< str.length(); i++){
			if(Character.isUpperCase(str.charAt(i))) upperCase++;
			if(Character.isLowerCase(str.charAt(i))) loweCase++;
		}
		System.out.println(upperCase);
		System.out.println(loweCase);
		sc.close();

	}

}
