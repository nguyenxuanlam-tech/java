package Thi;

import java.util.Scanner;

public class ThuVien {
	/*
	 * Nhap so kieu int
	 * */
	public static int inputInt(String tb) {
		int kq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(tb);
		kq = sc.nextInt();
		return kq;
	}
	
	/*
	 * Nhap diem kieu float
	 * */
	public static Float inputFloat(String tb) {
		float kq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(tb);
		kq = sc.nextFloat();
		return kq;
	}
}
