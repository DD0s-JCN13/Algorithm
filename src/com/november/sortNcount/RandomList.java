package com.november.sortNcount;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class RandomList {
	//n項資料隨機排列
	Random r1 = new Random();
	int random = 0;
	int tmp = 0;
	private static int[] list = {5,19,32,17,62,28,24};
	static List<Integer> rantmp = new ArrayList<Integer>();
	//陣列用來存放原始資料列，而ArrayList用來存放隨機排列後的結果
	public RandomList() {
		
	}
	public void generate() {
		for(int i=0;i<list.length;i++) {
			//ArrayList起始加入元素
			rantmp.add(list[i]);
		}
		for(int i=0;i<rantmp.size();i++) {
			//原理近似於洗牌
			random = r1.nextInt(rantmp.size()-1);
			tmp = rantmp.get(i);
			rantmp.set(i, rantmp.get(random));
			rantmp.set(random, tmp);
		}
	}
	public void printer(){
		System.out.print("原始資料： ");
		for(int i=0;i<list.length;i++) {
			if(i!=list.length-1) {
				System.out.print(list[i]+" ");
			}else {
				System.out.println(list[i]);
			}
		}
		System.out.print("隨機排列後之資料： ");
		for(int i=0;i<rantmp.size();i++) {
			if(i!=rantmp.size()-1) {
				System.out.print(rantmp.get(i)+" ");
			}else {
				System.out.println(rantmp.get(i));
			}
		}
	}
	public static void main(String args[]) {
		RandomList rl = new RandomList();
		rl.generate();
		rl.printer();
	}
}
