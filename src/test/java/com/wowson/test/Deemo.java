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
			}
			static void pong() {
			System.out.print("pong");
			}
}
