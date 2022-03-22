package LT_Buoi6;

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
	
	/*
	 * Tinh Diem Trung Binh
	 * */
	public static Float tinhDTB(float n1, float n2, float n3) {
		return n1+n2*2+n3;
	}
	
	/*
	 * Xep Loai
	 * */
	public static String XepLoai(float dtb) {
		return dtb < 5?"Yeu": dtb < 7?"Trung Binh":dtb < 8.5?"Kha":"Gioi";
	}
	
	/*
	 * Kiem Tra
	 * */
	public static boolean KiemTra(float a, float b, float c) {
		return a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10;
	}
	
	/*
	 * Ket qua
	 * */
	public static String KetQua(float dtb) {
		return dtb < 5?"Rot":"Dau";
	}
}
