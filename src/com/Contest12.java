package com;

import java.util.Scanner;

public class Contest12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int firstAry[][] = new int[rows][cols];
		int secondAry[][] = new int[rows][cols];
		int sum[][] = new int[rows][cols];
		
		for(int i=0; i < rows; i ++){
			for(int j=0; j< cols; j++) {
				firstAry[i][j] = sc.nextInt();
			}
		}
		
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		
		for(int i=0; i < rows2; i ++){
			for(int j=0; j< cols2; j++) {
				secondAry[i][j] = sc.nextInt();
			}
		}
		
		if(rows == rows2 && cols == cols2) {
			for(int i=0; i < rows; i ++){
				for(int j=0; j< cols; j++) {
					sum[i][j] = firstAry[i][j] + secondAry[i][j];
					if(j == rows-1){
						System.out.print(sum[i][j]);
					} else {
						System.out.print(sum[i][j]+" ");
					}
				}
				System.out.println("");
			}	
		}
				
		sc.close();
		
	}

}
