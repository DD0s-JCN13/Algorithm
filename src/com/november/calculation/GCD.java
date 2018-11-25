package com.november.calculation;

import java.util.Scanner;

public class GCD {
	/* 最大公因數與輾轉相除法
	 * |11		28|		
	 * |11		 6|		(6=28-11*2)
	 * |5		 6|		(5=11-6)
	 * |5		 1|		
	 * |0		 1|		>>>>這時候可以說1是 11與28的最大公因數
	 * 
	 */
	static int a1 = 0;
	static int a2 = 0;
	static int a1t = 0;
	static int a2t = 0;
	static int tmp = 0;
	static int gcd = 0;
	static boolean power = true;
	static boolean enter = false;
	static boolean counter = false;
	public GCD() {
		
	}
	public void calculation() {
		while(power) {
			Scanner sc = new Scanner(System.in);
			//輸入文字若不符合規定，又或是輸入值小於或等於零的話會讓程式自動關閉
			System.out.println("請輸入要尋找最大公因數的第一個數：");
			try {
				a1 = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("輸入格式錯誤，請重新執行程式！");
			}
			if(a1<=0) {
				System.out.println("小於或等於零的數無法計算最大公因數，請重新執行程式！");
				break;
			}else{
				System.out.println("請輸入要尋找最大公因數的第二個數：");
				try {
					a2 = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("輸入格式錯誤，請重新執行程式！");
				}if(a2<=0) {
					System.out.println("小於或等於零的數無法計算最大公因數，請重新執行程式！");
					power = false;
					break;
				}else {
					power = false;
					enter = true;
				}
			}
		}
		enter = true;
		while(enter) {
				if(a1>a2) {
					a2t=a1;
					a1t=a2;
					//此時，a2t必大於a1t
					counter = true;
					enter = false;
			}	
		}
		while(counter) {
				//判斷是否已經產生最大公因數>>a1t與a2t之間是否已經有一方為零
				if(a1t==0) {
					gcd=a2t;
					counter = false;
					break;
				}else if(a2t==0) {
					gcd=a1t;
					counter = false;
					break;
				}
				//判斷走勢，應使a1t-a2t，或是使a2t-a1t
				if(a2t>a1t) {
					tmp=a2t;
					a2t=a2t%a1t;
				}else {
					tmp=a1t;
					a1t=a1t%a2t;
				}
			}
	}
	public void printer() {
		System.out.print(String.valueOf(a1)+"與"+String.valueOf(a2)+"的最大公因數為"+String.valueOf(gcd));
	}
	public static void main(String args[]) {
		GCD gcd = new GCD();
		gcd.calculation();
		gcd.printer();
	}

}
