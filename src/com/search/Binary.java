package com.search;


import java.util.Scanner;

public class Binary {
	//二元搜尋法
	//在1~20的整數進行二元搜尋法
	static int bin = 0;
	static int end = 19;
	static int tmp = 1;
	static int[] list = new int[20];
	static boolean power = true;
	
	public static int codereturn() {
		return tmp;
	}
	
	
	public static void main(String args[]) {
		boolean binary = false;
		for (int i=0; i<list.length;i++) {
			list[i] = i+1;
		}
		Scanner sc = new Scanner(System.in);
		while(power) {
			System.out.print("請輸入1~20的數字，或輸入0結束程式：");
			int input = sc.nextInt();
			if(input == 0) {
				for(int i=0; i<list.length;i++) {
					if(list[i]<10) {
						System.out.println("第  "+(i+1)+"個數字[ "+list[i]+"]");
					}else {
						System.out.println("第"+(i+1)+"個數字["+list[i]+"]");
					}
				}
			}else if(input > 0 || input <= list.length) {
				binary = true;
				
			}else {
				System.out.println("資料格式錯誤，請重新輸入！");
			}
			
		}
	}
}
