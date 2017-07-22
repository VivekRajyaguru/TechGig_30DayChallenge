package com;

import java.io.*;

public class Contest7 {

	public static void main(String[] args) {
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Integer num1 = Integer.parseInt(reader.readLine());
			Integer num2 = Integer.parseInt(reader.readLine());
			checkPrime(num1, num2);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void checkPrime(Integer num1, Integer num2) {
		int counter = 0;
		int totalNum = 0;
		for(int i = num1 ; i <= num2 ; i++){
			counter = 0;
			for(int num = i; num >= 1; num --){
				if(i%num == 0) counter++;
			}
			if(counter == 2) {
				totalNum++;
			}
		}
		System.out.println(totalNum);
	}
	
}
