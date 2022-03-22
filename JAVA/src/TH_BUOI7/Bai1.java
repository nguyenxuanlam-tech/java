package TH_BUOI7;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, temp;
		
		do {
			System.out.printf("Hay nhap n: \t");
			n = sc.nextInt();
			System.out.printf("Cac so chan nam trong khoang [%d : 100] la: \n", n);
			for(int i = 100 ; i  > n; i-- ) {
				if(i % 2 == 0) {
					System.out.printf("\t%d\t\n", i);
				}
			}
			
			System.out.println("Ban co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
			
		}while(temp != 0);
	}

}
