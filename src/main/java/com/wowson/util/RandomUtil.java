package com.wowson.util;

public class RandomUtil {
	public static void main(String[] args) {
		java.util.Random r=new java.util.Random();
		for(int i=0;i<10;i++){
		    System.out.println(r.nextInt(1));
		}
	}
}
