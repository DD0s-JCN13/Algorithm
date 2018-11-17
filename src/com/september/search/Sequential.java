package com.september.search;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
public class Sequential {
	//循序搜尋法
	public static void main(String args[]) {
		//設計一個在1~100之間隨機產生20個不排序整數數列的搜尋程式
		int input = 0;
		int counter = 1;
		boolean power = true;
		Random r = new Random();
		Set list = new HashSet();
		do {
			list.add(r.nextInt(100)+1);
		}while(list.size()<20);
		Scanner sc = new Scanner(System.in);
		while(power) {
			System.out.print("請輸入1~100之間的數字，或輸入0退出：");
			String tmp = sc.next();
			input = Integer.parseInt(tmp);
			Iterator it = list.iterator();
			if(input>0 && input<=100) {
				counter = 1;
				while(it.hasNext()) {
					String out = it.next().toString();
					int tmp2 = Integer.parseInt(out);
					if(input == tmp2) {
						System.out.println("在第"+counter+"個數字找到目標值：["+tmp2+"]");
						break;
					}else if(counter ==20) {
						System.out.println("很抱歉，找不到相符的資料，請重新輸入");
						break;
					}else {
						counter = counter + 1;
					}
				}
			}else if(input==0) {
				counter = 1;
				while(it.hasNext()) {
					System.out.println("第"+(counter)+"個數字：["+it.next().toString()+"]");
					counter = counter + 1;
				}
				power = false;
				break;
			}else {
				System.out.println("輸入格式錯誤，請重新輸入！");
			break;
			}
		}
	}

}
