package com.november.calculation;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MaxminCounter {
	static boolean input = true;
	static boolean pusher = false;
	static boolean search = false;
	Scanner sc ;
	public static List<Integer> origin = new ArrayList<Integer>();
	public static List<Integer> ls = new ArrayList<Integer>();
	public MaxminCounter() {
		
	}
	public void log() {
		sc = new Scanner(System.in);
		while(input) {
			System.out.println("請輸入要加入的數字，或輸入x結束輸入：");
			String read = sc.nextLine();
			if(read!=null){
				if(read.equals("x")) {
					for(int i=0;i<origin.size();i++) {
						ls.add(origin.get(i));
					}
					input=false;
					pusher=true;
				}else {
					try {
						origin.add(Integer.parseInt(read));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						System.out.println("輸入格式錯誤，請重新輸入！");
					}
			 	}
			}
		}
		if(pusher) {
			//交換排序法，其結果為由小到大進行排序
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
			search=true;
		}
	}
	public void searching() {
		sc = new Scanner(System.in);
		while(search) {
			System.out.println("請輸入要搜尋的第n筆內容，輸入x以結束系統，或輸入MAX或min來搜尋整體資料的最大值或最小值：");
			String read2 = sc.nextLine();
			if(read2!=null) {
				if(read2.equals("MAX")) {
					//取經過整理的最後結果，最後一筆必為最大值
					int max = ls.get(ls.size()-1);
					System.out.println("整體資料之最大值為： "+max);
				}else if(read2.equals("min")) {
					//與最大值相反，第一筆必為最小值
					int min = ls.get(0);
					System.out.println("整體資料之最小值為： "+min);
				}else if(read2.equals("x")) {
					System.out.println("系統已關閉！");
					search=false;
					break;
				}else {
					try {
						int info = Integer.parseInt(read2);
						if(info-1<0) {
							System.out.println("超出搜尋範圍，請重新輸入！");
						}else if(info-1>=origin.size()) {
							System.out.println("超出搜尋範圍，請重新輸入！");
						}else {
							System.out.println("第 "+info+"筆資料為："+origin.get(info-1));
						}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//避免無法轉換之值出現
						System.out.println("輸入格式錯誤，請重新輸入！");
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		MaxminCounter mmc = new MaxminCounter();
		mmc.log();
		mmc.searching();
	}
}
