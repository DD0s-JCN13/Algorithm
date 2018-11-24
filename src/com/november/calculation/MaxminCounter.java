package com.november.calculation;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxminCounter {
	static boolean input = true;
	static boolean pusher = false;
	static List<Integer> ls = new ArrayList();
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(input) {
			System.out.println("請輸入要加入的數字，或輸入x結束輸入：");
			String read = sc.nextLine();
			if(read!=null){
				if(read.equals("x")) {
					input=false;
					pusher=true;
				}else {
					ls.add(Integer.parseInt(read));
			 	}
			}
		
		while(pusher) {
			for(int i=0;i<ls.size();i++) {
				System.out.print(ls.get(i)+" ");
			}
		}
	}
	}
}
