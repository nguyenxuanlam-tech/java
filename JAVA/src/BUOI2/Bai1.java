package BUOI2;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, phanNguyen, phanDu;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số a: ");
		a = sc.nextInt();
		System.out.println("Nhập số b: ");
		b = sc.nextInt();
		
		if(a > 0 && b >0 ) {
			phanNguyen = a / b;
			phanDu = a % b;
			System.out.printf("phần nguyên của %d / %d = %d \n", a, b, phanNguyen);
			System.out.printf("phần dư của %d % %d = %d \n", a, b, phanDu);
		}else
			System.out.println("Bạn cần nhập vào số nguyên dương '>0'");
	}

}
