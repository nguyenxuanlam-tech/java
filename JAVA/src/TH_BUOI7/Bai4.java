package TH_BUOI7;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, temp;
		do {
			System.out.println("Hay nhap a: ");
			a = sc.nextInt();
			System.out.println("Hay nhap b: ");
			b = sc.nextInt();
			
			for(int i = a; i < b; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d \t",i);
				}
			}
			
			System.out.printf("\nBan co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
	}

}
