package Thi;

import java.util.Scanner;

import LT_Buoi6.ThuVien;

public class Bai1 {
	
	// Ham Kiem tra n co phai la so nguyen to hay khong
    public static boolean SNT(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    // Ham xac dinh uoc so chung lon nhat cua 2 so nguyen duong
    public static int USCLN(int a, int b) {
    	int temp1, temp2, uscln;
    	// tim uoc so chung lon nhat
        temp1 = a;
        temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;

        return uscln;
    }

	public static void main(String[] args) {
		int a, b, chon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Cau 1.");
			System.out.println("---1. Kiem tra 1 so nguyen duong co phai la so nguyen to hay khong?     -----");
			System.out.println("---2. Xac dinh uoc so chung lon nhat cua 2 so nguyen duong              -----");
			System.out.println("---3. Thoat.											                -----");
			
			chon = Thi.ThuVien.inputInt("Ban hay chon chuc nang");
			switch(chon) {
				case 1:{
					do {
						System.out.println("Hay nhap so nguyen a, [a > 0].");
						a = sc.nextInt();
						if(SNT(a)) {
							System.out.println(a +" La so nguyen to. ");
						}
						else {
							System.out.println(a +" Khong la so nguyen to. ");
						}
							
					}while(a < 0);
					break;
				}
				case 2:{
					do {
						System.out.println("Nhap vao so thu nhat [a > 0]: ");
				        a = sc.nextInt();
				        System.out.println("Nhap vào số thứ hai [b > 0]: ");
				        b = sc.nextInt();
				        
				        if(a <= 0 || b <= 0) {
				        	System.out.println("Du lieu khong hop le! vui long nhap lai.");
				        }else {
				        	System.out.println("Uoc so chung cua " + a + " và " + b + " = " + USCLN(a, b));
				        }
				        
				        
					}while(a <= 0 || b <= 0);
					
					break;
				}
			} 
		}while(chon != 3 );
	}

}
