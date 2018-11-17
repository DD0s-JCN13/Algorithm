package com.calculation;

public class MatrixMultiplication2x2 {
	//二維矩陣乘法
	/*
	 * ┌ 2 4 ┐   ┌ 1 3 ┐   ┌ 22 34 ┐
	 * │     │ * │     │ = │       │
	 * └ 6 8 ┘   └ 5 7 ┘   └ 46 74 ┘
	 * 
	 * T11 = A11*B11 + A12*B21
	 * T12 = A11*B12 + A12*B22
	 * T21 = A21*B11 + A22*B21
	 * T22 = A21*B12 + A22*B22
	 */
	public static void main(String args[]) {
		int martixA[][] = new int[2][2];
		int martixB[][] = new int[2][2];
		int martixTot[][] = new int [2][2];
		int base1 = 2;
		int base2 = 1;
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++) {
				martixA[j][k] = base1;
				base1 = base1 + 2;
				martixB[j][k] = base2;
				base2 = base2 + 2;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(i==0 && j==0) {
					martixTot[i][j] = (martixA[i][j] * martixB[i][j]) + (martixA[i][j+1] * martixB[i+1][j]);
				}else if (i==1 && j==1) {
					martixTot[i][j] = (martixA[i][j-1] * martixB[i-1][j]) + (martixA[i][j] * martixB[i][j]);
				}else if (i==1 && j!=1) {
					martixTot[i][j] = (martixA[i][j] * martixB[i-1][j]) + (martixA[i][j+1] * martixB[i][j]);
				}else if (i!=1 && j==1){
					martixTot[i][j] = (martixA[i][j-1] * martixB[i][j]) + (martixA[i][j] * martixB[i+1][j]);
				}
			}
		}
		for(int k=1;k<=3;k++) {
			if(k==2) {
				System.out.println("│     │ * │     │ = │       │");
			}else if(k==1){
				System.out.print("┌ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixA[k-1][i]+" ");
				}
				System.out.print("┐   ┌ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixB[k-1][i]+" ");
				}
				System.out.print("┐   ┌ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixTot[k-1][i]+" ");
				}
				System.out.println("┐");
			}else {
				System.out.print("└ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixA[k-2][i]+" ");
				}
				System.out.print("┘   └ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixB[k-2][i]+" ");
				}
				System.out.print("┘   └ ");
				for(int i=0;i<2;i++) {
					System.out.print(martixTot[k-2][i]+" ");
				}
				System.out.println("┘");
			}
		}
	}
}
