package com.september.calculation;

import java.util.Scanner;

public class LoopMultiplication {
	//n階乘法計算
	static Scanner sc =  new Scanner(System.in);
	static boolean power = true;
	public static void main(String args[]) {
		while(power) {
			double base = 1;
			System.out.print("請輸入任意非負整數，或輸入-1結束程式：");
			int input = sc.nextInt();
			if(input == -1) {
				System.out.print("程式已關閉");
				power = false;
			}else if(input == 0) {
				System.out.println("0! = " + base);
			}else if(input >= 1) {
				for(int i=1;i<=input;i++) {
					base = base * i;
				}
				System.out.println(input+"! = "+base);
			}else {
				System.out.println("資料格式輸入錯誤，請重新輸入！");
			}
		}
	}
}
