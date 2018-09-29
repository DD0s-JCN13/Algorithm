package com.sort;

public class Exchange {
	//交換排序法 Exchange Sort
	static int list[] = new int[] {26,41,57,68,19,33,5};
	int tmp = 0;
	public void Exchange() {
		
	}
	public void origin() {
		System.out.print("初始資料：");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println("");
		System.out.println("--------------------------------------");
	}
	public void exchange() {
		for(int i=1;i<list.length;i++) {
			for(int j=0;j<list.length-1;j++) {
				if(list[j] > list[j+1]) {
					tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
			System.out.print("第"+i+"次執行結果：");
			for(int j=0;j<list.length;j++) {
				System.out.print(list[j]+" ");
			}
			System.out.println("");
		}
	}
	public void fin() {
		System.out.println("--------------------------------------");
		System.out.print("最終執行結果：");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
	public static void main(String args[]) {
		Exchange e = new Exchange();
		e.origin();
		e.exchange();
		e.fin();
	}
}
