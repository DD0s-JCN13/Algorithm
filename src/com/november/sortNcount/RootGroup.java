package com.november.sortNcount;

public class RootGroup {
	static int[] list = {1,4,7};
	public RootGroup() {
		
	}
	public void sorter() {
		//No item
		System.out.println("[null]");
		//Single item
		for(int i=0;i<list.length;i++) {
			if(i==(list.length-1)) {
				System.out.println("["+list[i]+"]");
			}else {
				System.out.print("["+list[i]+"]  ");
			}
		}
		//Two items
		for(int i=0;i<(list.length-1);i++) {
			for(int j=i+1;j<list.length;j++) {
				if(i==(list.length-2)) {
					System.out.println("["+list[i]+","+list[j]+"]");
				}else {
					System.out.print("["+list[i]+","+list[j]+"]  ");
				}
			}
		}
		//All items
		System.out.print("[");
		for(int i=0;i<list.length;i++) {
			if(i==list.length-1) {
				System.out.print(list[i]);
			} else{
				System.out.print(list[i]+",");
			}
		}
		System.out.print("]");
	}
	public static void main(String args[]) {
		RootGroup rg = new RootGroup();
		rg.sorter();
	}
}
