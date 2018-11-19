package com.november.calculation;

import java.util.Scanner;

public class Combination {
	public static double N;
	public static double M;
	public Combination() {
		
	}
	public void setn(double n) {
		this.N = n;
	}
	public void setm(double m) {
		this.M = m;
	}
	
	public static double returnstep(double step) {
		double stepres = 1;
		for(double i=1;i<=step;i++) {
			stepres=stepres*i;
		}
		return stepres;
	}
	public static double returnC(double n, double m) {
		double C = 1;
		if(n==0||m==0) {
			C = 1;
		}else {
			double o = 0;
			double s1 = 0;
			double s2 = 0;
			o = returnstep(n);
			s1 = returnstep(m);
			s2 = returnstep((n-m));
			C = o/(s1*s2);
		}
		return C;
	}
	public static double returnres(double a, double b) {
		double result = 0;
		result = returnC((a-1),b) + returnC((a-1),(b-1));
		return result;
	}
	public static void main(String args[]) {
		
		/*組合公式C(n,m)
		n在上，m在下，兩者有一者為零則結果必為1
		若皆非零正數則為C(n,m) = C(n-1,m) + C(n-1,m-1)
		計算過程 C(n,m) = n!/[m!*(n-m)!]
		*/
		boolean power =true;
		Scanner sc = new Scanner(System.in);
		Combination c = new Combination();
		while(power) {
			System.out.println("組合公式C(n,m)分為上係數n與下係數m，兩者皆為非負整數，請輸入上係數n，或輸入-1結束程式：");
			int in1 = Integer.parseInt(sc.nextLine());
			if(in1<-1) {
				System.out.println("輸入格式錯誤，請重新輸入！");
				break;
			}else if(in1==-1) {
				System.out.println("程式已關閉");
				power =false;
				break;
			}else {
				c.setn(in1);
				System.out.println("請輸入下係數m：");
				int in2 = Integer.parseInt(sc.nextLine());
				if(in2<0) {
					System.out.println("輸入格式錯誤，請重新執行程式！");
					break;
				}else {
					c.setm(in2);
					double res = c.returnres(N, M);
					System.out.println("C("+in1+","+in2+")的結果為  "+res);
				}
			}
		}
		
	}

}
