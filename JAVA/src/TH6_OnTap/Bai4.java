package TH6_OnTap;

import java.util.Scanner;

import LT_BUOI4.bai2;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon, temp;
		do {
			System.out.println("--------------------------------------");
			System.out.println("-----1. Giai phuong trinh bac 1  -----");
			System.out.println("-----2. Giai phuong trinh bac 2  -----");
			System.out.println("-----3. Tinh tien dien           -----");
			System.out.println("-----0. Thoat chuong trinh       -----");
			System.out.println("--------------------------------------");
			System.out.println("-----Moi ban chon chuc nang	     -----");
			
			chon = sc.nextInt();
			
			switch (chon) {
			case 1: 
				System.out.println("Hay nhap a: ");
				float a = sc.nextFloat();
				System.out.println("Hay nhap b: ");
				float b = sc.nextFloat();
				Bai1.giaiPTBac1(a, b);
				break;
			case 2:
				System.out.println("Hay nhap a: ");
				a = sc.nextFloat();
				System.out.println("Hay nhap b: ");
				b = sc.nextFloat();
				System.out.println("Hay nhap c: ");
				float c = sc.nextFloat();
				Bai2.giaPTBac2(a, b, c);
				break;
			case 3:
				System.out.println("Hay nhap so dien cu: ");
				int oldNumber = sc.nextInt();
				System.out.println("Hay nhap so dien moi: ");
				int newNumber = sc.nextInt();
				Bai3.tinhTienDien(oldNumber, newNumber);
				break;
			default:
				System.exit(0);
			}
			System.out.printf("\nBan co muon tiep tuc [1:0] \n\n");
			temp = sc.nextInt();
		}while(temp != 0);
	}

}
