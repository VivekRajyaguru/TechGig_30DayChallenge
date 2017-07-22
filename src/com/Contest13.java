package com;

import java.util.Scanner;

public class Contest13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int tempAry[][] = new int[rows][cols];
		
		for(int i=0; i < cols; i++) {
			for(int j=0; j< rows; j++) {
				tempAry[j][i] = sc.nextInt();
			}
		}
		for(int i=0 ; i < rows; i++) {
			for(int j=0; j< cols; j++) {
				System.out.print(j == cols-1 ? tempAry[i][j]: tempAry[i][j]+" ");
			}
			System.out.println();
		}	
		sc.close();
		
	}

}
