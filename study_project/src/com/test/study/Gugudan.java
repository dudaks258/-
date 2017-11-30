package com.test.study;

public class Gugudan {

	public static void main(String[] args) {

		for (int dno = 2; dno < 10; dno++) {
			System.out.println(dno + "단 입니다.");
			for (int gop = 1; gop < 10; gop++) {
				System.out.println(dno + "*" + gop + "=" + dno * gop);
			}
			System.out.println();
		}
		System.out.println("Hello");
		System.out.println("Hello spring");
		System.out.println("Hello java");
		System.out.println("Hello css");
		System.out.println("Hello HTML");
	}

}
