package com.december.sort;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class FastSort {
	public FastSort() {
		
	}
	Scanner sc;
	int first=0;
	int end=0;
	FastSort fs = new FastSort();
	static List<Integer> data = new ArrayList<Integer>();
	public int getFirst() {
		return first;
	}
	public int getEnd() {
		return end;
	}
	public void Sorting() {
		boolean sorter = true;
		int counter=0;
		int getterL=0;
		int getterR=0;
		while(sorter) {
			int K = data.get(0);
			for(int i=1;i<data.size();i++) {
				if(data.get(i)>K) {
					getterL = data.get(i);
					break;
				}
			}
			for(int i=data.size()-1;i>1;i--) {
				if(data.get(i)<K) {
					getterR = data.get(i);
					break;
				}
			}
			while(getterL!=0&&getterR!=0) {
				
			}
			
			
			
		}
	}
	

}
