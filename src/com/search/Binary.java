package com.search;


import java.util.Scanner;

public class Binary {
	//二元搜尋法
	//在1~20的整數進行二元搜尋法
	static int[] list = new int[20];
	static boolean power = true;
	
	public static void main(String args[]) {
		boolean binary = false;
		for (int i=0; i<list.length;i++) {
			list[i] = i+1;
		}
		Scanner sc = new Scanner(System.in);
		while(power) {
			System.out.print("請輸入1~20的數字，或輸入0結束程式：");
			int beg = 1;
			int end = 20;
			int count = 0;
			int input = sc.nextInt();
			if(input == 0) {
				power = false;
			}else if(input > 0 && input <= list.length) {
				binary = true;
				while(binary) {
					int mid = (beg+end)/2;
					if(input>mid) {
						System.out.println(input + " 在["+mid+"]與["+end+"]之間，取右半邊");
						beg = mid;
						if(beg == 19) {
							count++;
						}
						if(count>0) {
							int tmp = 0;
							for(int i=beg-1;i<=end-1;i++) {
								if(list[i]==input) {
									tmp = i+1;
								}
							}
							System.out.println("在第"+tmp+"個位置找到數字["+end+" ]");
							binary = false;
						}
					}else if(input<mid) {
						System.out.println(input + " 在["+beg+"]與["+mid+"]之間，取左半邊");
						end = mid;
						if(end == 2) {
							count++;
						}
						if(count>0) {
							int tmp = 0;
							for(int i=beg-1;i<=end-1;i++) {
								if(list[i]==input) {
									tmp = i+1;
									}
								}
								System.out.println("在第"+tmp+"個位置找到數字["+beg+" ]");
								binary = false;
							}
					}else {
						int tmp = 0;
						for(int i=beg-1;i<=end-1;i++) {
							if(list[i]==input) {
								tmp = i+1;
							}
						}
						System.out.println(input + "即為中間值，在第"+tmp+"個位置找到數字["+mid+" ]");
						binary = false;
					}
				}
				
			}else {
				System.out.println("資料格式錯誤，請重新輸入！");
			}
			
		}
	}
}
