package com.december.sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class FastSort {
	public FastSort() {
		
	}
	Scanner sc;
	int first=0;
	int back=0;
	FastSort fs = new FastSort();
	static List<Integer> data = new ArrayList<Integer>();
	static List<Integer> listF = new ArrayList<Integer>();
	static List<Integer> listB = new ArrayList<Integer>();
	public int getFirst() {
		return first;
	}
	public int getBack() {
		return back;
	}
	public void readpoint(int first, int back) {
		//用於確認要進行快速分類的區域
		int location=0;
		if(listF.size()==0&&listB.size()==0) {
			listF.add(first);
			listB.add(back);
		}else {
			for(int i=0;i<listF.size();i++) {
				if(first<=listF.get(i)) {
					if(i==listF.size()-1) {
						int tmp = listF.get(i);
						listF.set(i, first);
						listF.add(tmp);
					}else {
						int tmp1=0;
						int tmp2=0;
						for(int j=i;j<listF.size();j++) {
							
						}
					}
				}else {
					listF.add(first);
				}
			}
		}
		
	}
	public void Sorting(int front, int back) {
		boolean sorter = true;
		int getterL=0;
		int getterR=0;
		int positionL=0;
		int positionR=0;
		while(sorter) {
			int key = data.get(front);
			for(int i=front+1;i<back;i++) {
				if(data.get(i)>key) {
					getterL = data.get(i);
					positionL=i;
					break;
				}
			}
			for(int i=back;i>front;i--) {
				if(data.get(i)<key) {
					getterR = data.get(i);
					positionR=i;
					break;
				}
			}
			if(positionL<positionR) {
				int tmp = getterL;
				data.set(positionL, getterR);
				data.set(positionR, tmp);
			}else {
				
			}
			
			
			
		}
	}
	

}
