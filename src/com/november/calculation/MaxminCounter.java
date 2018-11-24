package com.november.calculation;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MaxminCounter {
	static boolean input = true;
	static boolean pusher = false;
	static int counter=0;
	static List<Integer> ls = new ArrayList<Integer>();
	public void MaxminCounter() {
		
	}
	public void log() {
		Scanner sc = new Scanner(System.in);
		while(input) {
			System.out.println("請輸入要加入的數字，或輸入x結束輸入：");
			String read = sc.nextLine();
			if(read!=null){
				if(read.equals("x")) {
					input=false;
					pusher=true;
				}else {
					try {
						ls.add(Integer.parseInt(read));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						System.out.println("輸入格式錯誤，請重新輸入！");
					}
					counter++;
			 	}
			}
		}
		while(pusher) {
			int tmp=0;
			for(int i=1;i<ls.size();i++) {
				for(int j=0;j<ls.size()-1;j++) {
					if(ls.get(j) > ls.get(j+1)) {
						tmp = ls.get(j);
						ls.set(j, ls.get(j+1));
						ls.set(j+1, tmp);
					}
				}
			}
			pusher=false;
		}
	}
	public void searching() {
		System.out.println("");
	}
	public static void main(String args[]) {
		MaxminCounter mmc = new MaxminCounter();
		mmc.log();
	}
}
