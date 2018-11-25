package com.november.sortNcount;
import java.util.Random;
public class RandomList {
	//n項資料隨機排列
	Random r1 = new Random();
	int random = 0;
	int counter = 0;
	boolean checker = false;
	static int[] rantmp = {};
	static int[] list = {5,19,32,17,62,28,24};
	static int[] nlist = {};
	public RandomList() {
		
	}
	public void generate() {
		for(int i=0;i<list.length;i++) {
			if(i==0) {
				rantmp = list;
				nlist = list;
				random = r1.nextInt(list.length);
			}else {
				for(int j=0;j<i;j++) {
					if(j==i-1) {
						
					}
				}
			}
			rantmp[i] = random;
		}
		for(int i=0;i<list.length;i++) {
			counter = rantmp[i];
			nlist[i] = list[counter];
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
		for(int i=0;i<nlist.length;i++) {
			if(i!=nlist.length-1) {
				System.out.print(nlist[i]+" ");
			}else {
				System.out.println(nlist[i]);
			}
		}
	}
	public static void main(String args[]) {
		RandomList rl = new RandomList();
		rl.generate();
		rl.printer();
	}
}
