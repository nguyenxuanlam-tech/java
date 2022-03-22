package TH_BUOI7;

import java.util.Scanner;

public class Bai1Method {
	
	static void soSanh(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.printf("So lon nhat la: %d \n", a);
			return;
		}else if(b>c && b>a) {
			System.out.printf("So lon nhat la: %d \n", b);
			return;
		}else if(c>a && c>b) {
			System.out.printf("So lon nhat la: %d \n", c);
			return;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, temp;
				
		do {
			
			System.out.println("Hay nhap a: ");
			a = sc.nextInt();
			System.out.println("Hay nhap b: ");
			b = sc.nextInt();
			System.out.println("Hay nhap c: ");
			c = sc.nextInt();
			
			soSanh(a, b, c);
			System.out.println("Ban co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
	}

}
