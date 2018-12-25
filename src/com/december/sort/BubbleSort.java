package com.december.sort;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	static List<Integer> line = new ArrayList<Integer>();
	static Scanner sc;
	
	public static void main(String[] args) {
		boolean readin = true;
		boolean sort = false;
		sc= new Scanner(System.in);
		do {
			System.out.println("請輸入要進行排列得數字，或輸入end結束輸入：");
			String gettext = sc.nextLine();
			if(gettext.equals("end")) {
				readin = false;
				sort = true;
			}else {
				try {
					line.add(Integer.parseInt(gettext));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("輸入格式錯誤，請重新輸入！");
				}
			}
		}while(readin);
		do {
			for(int i=0;i<line.size()-1;i++) {
				boolean change = false;
				for(int j=0;j<line.size()-1;j++) {
					if(line.get(j)>line.get(j+1)) {
						int tmp = line.get(j);
						line.set(j, line.get(j+1));
						line.set(j+1, tmp);
						change = true;
					}
				}
				if(change) {
					System.out.print("第"+(i+1)+"次交換結果：");
					for(int j=0;j<line.size();j++) {
						if(j==line.size()-1) {
							System.out.println(line.get(j));
						}else {
							System.out.print(line.get(j)+" ");
						}
					}
				}
				else {
					continue;
				}
			}
			System.out.print("排序結果：");
			for(int i=0;i<line.size();i++) {
				System.out.print(line.get(i)+" ");
			}
			sort = false;
		}while(sort);
	}
	
}
