package com.november.calculation;

import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String args[]) {
		//費氏數列
	
	int Fn=0;
	boolean power = true;
	Scanner sc = new Scanner(System.in);
	while(power) {
		int tmp1=1;
		int res=0;
		System.out.println("請輸入要計算的費氏級數，或輸入-1結束程式：");
		String in = sc.nextLine();
		Fn = Integer.parseInt(in);
		if(Fn==-1) { 
			power = false;
			System.out.println("程式已關閉");
			break;
		}else {
			for(int i=0;i<=Fn;i++) {
				if(i>2) {
					res=res+tmp1;
					tmp1++;
				}else if(i==2) {
					res = res+tmp1;
				}else {
					res=1;
				}
			}
			System.out.println(Fn+"的費氏級數為  "+res);
		}
	}	
}
}

