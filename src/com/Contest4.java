package com;

import java.util.Scanner;

public class Contest4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer age = sc.nextInt();
		
		String msg = (age <= 10) ?  "I am happy as having no responsibilities." : (age >= 10 && age < 18) ? "I am still happy but starts feeling pressure of life.":"I am very much happy as i handled the pressure very well."; 
		System.out.println(msg);
	}

}
