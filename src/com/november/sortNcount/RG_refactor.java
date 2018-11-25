package com.november.sortNcount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class RG_refactor {
	static List<Integer> origin = new ArrayList<>();
	static List<Integer> newlist = new ArrayList<>();
	Scanner sc;
	boolean reader = true;
	boolean print = true;
	static int parse;
	static int random = 0;
	Random ran;
	public RG_refactor(){
		
	}
	public void readin() {
		while(reader) {
			System.out.println("請輸入要加入陣列的數字資料，或輸入x停止輸入：");
			String in = sc.nextLine();
			if(in=="x") {
				reader = false;
				break;
			}else {
				try {
					parse = Integer.parseInt(in);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("資料格式輸入錯誤，請重新輸入！");
				}
				origin.add(parse);
			}
		}
	}
	public void printer() {
		while(print) {
			System.out.println("共有"+origin.size()+"筆資料，請輸入要顯示包含N筆資料的子集合，或輸入ALL以顯示所有資料：");
			String in = sc.nextLine();
			if(in=="ALL") {
				
			}else {
				try {
					parse = Integer.parseInt(in);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("資料格式輸入錯誤，請重新輸入！");
				}
				if(parse<0||parse>origin.size()) {
					System.out.println("輸入值超出範圍，請重新輸入！");
				}else {
					if(parse==0) {
						System.out.println("包含0筆資料的子集合為：空集合");
					}else {
						for(int i=0;i<origin.size()-(parse+1);i++) {
							random = ran.nextInt(origin.size()-1);
						}	
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		
	}
}
