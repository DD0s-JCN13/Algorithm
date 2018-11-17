package com.september.search;
import java.util.Scanner;


public class SequentialRefactor {
	static boolean power = true;
	static int[] list = new int[10];
	static int tmp = 0;
	
	public int codereturn() {
		return tmp;
	}
	public static int sequentialsearch(int in) {
		for(int i=0;i<list.length;i++) {
			if(in == list[i]) {
				tmp = i+1;
				return in;
			}
		}
		return -1;
	}
	
	
	public static void main (String args[]) {
		for(int i=0;i<list.length;i++) {
			list[i] = i+1;
		}
		Scanner sc = new Scanner(System.in);
		while(power) {
			System.out.print("請輸入1~10的數字，或輸入0結束程式：");
			int input = sc.nextInt();
			if(sequentialsearch(input)!=-1) {
					System.out.println("在第"+tmp+"個位置找到數字["+sequentialsearch(input)+"]");
			}else {
				if(input ==0) {
					for(int i=0;i<list.length;i++) {
						if(list[i]<10) {
							System.out.println("第  "+(i+1)+"個數字[ "+list[i]+"]");
						}else {
							System.out.println("第"+(i+1)+"個數字["+list[i]+"]");
						}
					}
					power = false;
				}else {
					System.out.println("輸入內容格式錯誤，請重新輸入！");
				}
			}
		}
	}
}
