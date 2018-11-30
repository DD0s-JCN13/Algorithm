package com.november.calculation;
import java.util.Scanner;

public class Ackermann {
	/*
	 * 該係數定義 A[m,n]
	 * 相關數據與定義參考網頁如下：
	 * https://zh.wikipedia.org/wiki/%E9%98%BF%E5%85%8B%E6%9B%BC%E5%87%BD%E6%95%B8
	 * https://coderanch.com/t/633667/java/Ackermann-function
	 * 導出相關數據，目前可以歸納出的邏輯為：
	 * res=n+1 當 m=0
	 * res=n+2 當 m=1
	 * res=(-3)+2*(n+3)當m=2
	 * res=(-3)+2^(n+3)當m=3
	 * res=(-3)+2^(4^(n+1))當m=4
	 */
	long result=0;
	Scanner sc;
	public Ackermann() {
		
	}
	public long Ackernew(long m, long n) {
		result=0;
		int count=0;
		int code = Integer.parseInt(Long.toString(m));
		switch(code) {
		case 0:
			result = n+1;
			break;
		case 1:
			result = n+2;
			break;
		case 2:
			result = (2*(n+3))-3;
			break;
		case 3:
			count=0;
			do {
				if(count==0) {
					result=2;
				}else {
					result = result*2;	
				}
				count = count+1;
			}while(count<Integer.parseInt(Long.toString(n))+3);
			result = result-3;
			break;
		case 4:
			count=0;
			do {
				if(count==0) {
					result=16;
				}else {
					result = result*result;	
				}
				count = count+1;
			}while(count<Integer.parseInt(Long.toString(n))+2);
			result = result-3;
			break;
		default:
			System.out.println("超出計算範圍！");	
			break;
		}
		return result;
	}
	public long Acker(long m, long n) {
		//Original calculation rule, exception comes out while A(m,n){m=4,n>0||m>=5,n>=0}
		if(m>=0&&n>=0) {
			if(m==0) {
				result = n+1;
			}else {
				if(n==0) {
					result = Acker(m-1,1);
				}else {
					result = Acker(m-1,Acker(m,n-1));
				}
			}
		}
		return result;
	}
	public static void main(String args[]) {
		Ackermann ack = new Ackermann();
		long formnew = ack.Ackernew(4,1);
		System.out.println(Long.toString(formnew));
		//long form = ack.Acker(4,1);
		//System.out.print(Long.toString(form));
	}

}
