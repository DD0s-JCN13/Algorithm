package com.november.calculation;

import java.util.Scanner;
public class NstepCalculation {
	public static void main(String args[]) {
		//N階乘法
	
		int step;
		int res=0;
		boolean power = true;
		while(power) {
			System.out.println("請輸入要計算的N階乘法，或輸入「-1」結束程式：");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			step = Integer.parseInt(input);
			if(step==-1) {
				power = false;
				System.out.println("程式已關閉");
				break;
			}else {
				for(int i=1;i<=step;i++) {
					if(i==1) {
						res = 1;
					}else {
						res = res*i;
					}
				}
				System.out.println(step+"階層的計算結果為  "+res);
			}
		
		
		}
	}
}
