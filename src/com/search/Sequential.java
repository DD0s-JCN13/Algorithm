package com.search;

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
		Iterator it = list.iterator();
		Scanner sc = new Scanner(System.in);
		while(it.hasNext()) {
			System.out.println("第"+(counter)+"個數字：["+it.next().toString()+"]");
			counter = counter + 1;
		}
	}

}
