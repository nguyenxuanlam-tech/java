package LT_Buoi6;

import java.util.Scanner;

public class TienDien {
	
	public static void NhapDL(int oldNumber, int newNumber, int temp) {
				
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Nhập định mức: ");
            temp = sc.nextInt();
            System.out.print("Nhập chỉ số cũ: ");
            oldNumber = sc.nextInt();
            System.out.print("Nhập chỉ số mới: ");
            newNumber = sc.nextInt();
        } while (oldNumber > newNumber);
		
	}
	
	public static Double tinhTienDien(  int temp, int oldNumber, int newNumber) {
		double totalMoney = 0;
		
		int any = (newNumber - oldNumber);
		do {
			
			if(any < temp ) {
				totalMoney = (double) (newNumber - oldNumber) * 1000;
			}else {
				totalMoney = (double) (newNumber - oldNumber) * 1000 + (any - temp)/ 100 * 0.1;
			}
		}while (any == 0);
		
		return totalMoney;
	}
	
	public static Double tinhTienNuoc(int temp, int oldNumber, int newNumber) {
		double totalMoney = 0;
		
		int any = (newNumber - oldNumber);
		do {
			
			if(any < temp ) {
				totalMoney = (double) (newNumber - oldNumber) * 12000;
			}else {
				totalMoney = (double) temp * 12000 + ((any -temp) * 16000);
			}
		}while (any == 0);
		
		return totalMoney;
	}

	public static void main(String[] args) {
		int oldNumber = 0, newNumber = 0, temp = 0, chon = 0;	
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("================Menu====================");
			System.out.println("===== 1. Nhập dữ liệu");
			System.out.println("===== 2. Tính tiền điện");
			System.out.println("===== 3. Tính tiền nước.");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				NhapDL(temp, newNumber, oldNumber);
				break;
			case 2:
				System.out.println("Tien dien: "+tinhTienDien(temp, oldNumber, newNumber));	
				break;
			case 3:
				System.out.println("Tien nuoc: "+tinhTienNuoc(temp, oldNumber, newNumber));
				break;
				csae 0:
					exit()'''
					break;
			}
			
			
			
			
			System.out.println();
		}while(chon != 0);
		

	}
}
