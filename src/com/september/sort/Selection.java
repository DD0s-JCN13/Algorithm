package com.september.sort;

public class Selection {
	//選擇排序法 Selection Sort
	static int list[] = new int[] {19,53,26,12,5,64,9};
	static int tmp = 0;
	public void Selection() {
		
	}
	public void origin() {
		System.out.print("初始資料結構：");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println("");
		System.out.println("------------------------------");
	}
	public void exchange() {
		for(int i=0;i<list.length-1;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
			System.out.print("第"+(i+1)+"次執行結果：");
			for(int k=0;k<list.length;k++) {
				System.out.print(list[k]+" ");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");
	}
	public void fin() {
		System.out.print("最終執行結果： ");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println("");
	}
	public static void main(String args[]) {
		Selection s = new Selection();
		s.origin();
		s.exchange();
		s.fin();
	}
}
