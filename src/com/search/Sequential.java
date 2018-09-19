package com.search;

import java.util.Scanner;
import java.util.Random;
public class Sequential {
	//循序搜尋法
	public static void main(String args[]) {
		//設計一個在1~100之間隨機產生20個不排序整數數列的搜尋程式
		int i,j;
		int input = 0;
		boolean power = true;
		boolean check = true;
		Random r = new Random();
		int base[] = new int[20];
		for(i=0;i<20;i++) {
			base[i] = r.nextInt(100)+1;
		}
		Scanner sc = new Scanner(System.in);
		while(power) {
			j=base.length;
			for(i=0;i<j;i++) {
				System.out.println("第"+(i+1)+"個數字：["+base[i]+"]");
				while(i==j-1) {
					power = false;
					break;
				}
			}
		}
		
	}

}
