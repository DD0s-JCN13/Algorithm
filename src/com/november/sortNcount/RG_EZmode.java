package com.november.sortNcount;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class RG_EZmode {
	boolean power = true;
	boolean printerp = false;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	List<Integer> origin = new ArrayList<>();
	List<Integer> rancode = new ArrayList<>();
	Set<Integer> random = new HashSet<>();
public RG_EZmode() {
	
}
public void readin() {
	while(power) {
		System.out.println("請輸入要加入的整數值，或輸入X停止輸入：");
		String in = sc.nextLine();
		if(in.equals("X")) {
			power = false;
			printerp = true;
			break;			
		}else {
			int parse = 0;
			try {
				parse = Integer.parseInt(in);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("輸入格式錯誤，請重新輸入！");
			}
			origin.add(parse);
		}
	}
}
public void annouce() {
	System.out.println("共輸入了"+origin.size()+"筆資料");
}
public void printer() {
	while(printerp) {
		System.out.println("請輸入0~"+origin.size()+"之間的任意整數，或輸入X結束查詢：");
		String in = sc.nextLine();
		if(in.equals("X")) {
			rancode.removeAll(null);
			System.out.println("系統已關閉！");
			printerp = false;
			break;
		}else {
			int parse = 0;
			try {
				parse = Integer.parseInt(in);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("輸入格式錯誤，請重新輸入！");
			}
			do {
				int code = rd.nextInt(origin.size()-1);
				random.add(code);
			}while(random.size()<parse);
			System.out.print("包含"+parse+"個元素的子集合亂數生成結果為：[");
			for(int i:random) {
				rancode.add(i);
			}
			for(int i=0;i<rancode.size();i++) {
				if(i==rancode.size()-1) {
					System.out.print(origin.get(rancode.get(i)));
				}else {
					System.out.print(origin.get(rancode.get(i))+" ");
				}
			}
			System.out.println("]");
		}
	}
}
/*public void printer() {
	System.out.print("包含之所有元素： [");
	for(int i=0;i<origin.size();i++) {
		if(i==origin.size()-1) {
			System.out.print(origin.get(i));
		}else {
			System.out.print(origin.get(i)+" ");
		}
	}
	System.out.print("]");
}*/
public static void main(String args[]) {
	RG_EZmode ez = new RG_EZmode();
	ez.readin();
	ez.annouce();
	System.out.println("本系統僅提供簡易子集合亂數生成");
	ez.printer();
}
}
