package TH6_OnTap;

import java.util.Scanner;

public class Bai3 {
	
	public static void tinhTienDien(int newNumber, int oldNumber) {
		int pice, number;
		long totalMoney = 0;
		number = newNumber - oldNumber;
		if(number < 50) {
			pice = 1000;
			totalMoney = number * pice;
			System.out.printf("So tien ban can phai thanh toan la : %d",totalMoney);
		}else {
			pice = 1200;
			totalMoney = 50*1000+(number - 50) * 1200;
			System.out.printf("So tien ban can phai thanh toan la : %d",totalMoney);
		}
	}

	public static void main(String[] args) {
		int newNumber, oldNumber, number, pice, temp, totalMoney;
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println("Ban hay nhap so dien cu[oldNumber < newNumber]: ");
				oldNumber = sc.nextInt();
				System.out.println("Ban hay nhap so dien moi[oldNumber < newNumber]: ");
				newNumber = sc.nextInt();
				
				tinhTienDien(newNumber, oldNumber);
				
			}while(newNumber < oldNumber);				
			System.out.printf("\nBan co muon tiep tuc [1:0] \n\n");
			temp = sc.nextInt();
		}while(temp != 0);
		
	}

}
