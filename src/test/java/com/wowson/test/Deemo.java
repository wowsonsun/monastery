package com.wowson.test;

public class Deemo {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				pong();
			}
		};
		t.run();
		System.out.print("ping");
		String s="aaa";
		boolean flag = isDuichenStr(s);
		if(flag == true){
			System.out.println("-------该字符串是对称的--------");
		}
		else{
			System.out.println("-------该字符串不是对称的--------");
			
		}
		System.out.println(flag);
	}

	static void pong() {
		System.out.print("pong");
	}

	public static boolean isDuichenStr(String s) {
		char[] chs = s.toCharArray();// 转字符数组
		int min = 0;
		int max = chs.length - 1;

		while (max >= min) {
			if (!new Character(chs[min++]).equals(chs[max--]))// 比较字符是否相同
				return false;
		}
		return true;
	}
}
