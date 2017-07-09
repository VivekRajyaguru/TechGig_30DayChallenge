package com;

import java.util.Scanner;

public class Contest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = CheckType(sc);
		System.out.println(msg);		
		sc.close();
		
	}
	
	static String CheckType(Scanner sc) {
		return sc.hasNextInt() ? "This input is of type Integer." : sc.hasNextFloat() ? "This input is of type Float.": sc.hasNext() ? "This input is of type String." : "This input is something else.";	
	}
}


