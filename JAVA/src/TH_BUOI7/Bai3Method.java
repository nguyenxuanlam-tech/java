package TH_BUOI7;

import java.util.Scanner;

public class Bai3Method {
	
	public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		do {
			System.out.println("Hay nhap n so nguyen duong: ");
			int n = sc.nextInt();
			
			System.out.printf("Giai thua cua %d la: %d \t\n", n, tinhGiaithua(n));
			
			System.out.println("Ban co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
	}

}
