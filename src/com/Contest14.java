package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Contest14 {

	public static void main(String[] args) {
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int count = Integer.parseInt(reader.readLine());
			String[] ary = new String[count];
			for(int i =0; i<count; i++) {
				ary[i] = reader.readLine();
			}
			Arrays.sort(ary);
			for(int i = 0; i <count; i++ ){
				System.out.println(ary[i]);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
