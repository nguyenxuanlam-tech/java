package TH_BUOI7;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		double a, b;
		long c = 1;
		
		do {
			System.out.println("Hay nhap a: ");
			a = sc.nextInt();
			System.out.println("Hay nhap b: ");
			b = sc.nextInt();
			
			for(int i = 0; i < b; i++) {
				c *= a;
			}
			System.out.printf("Ket qua: %d \n\t", c);
			
			System.out.printf("\nBan co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
		
	}

}
