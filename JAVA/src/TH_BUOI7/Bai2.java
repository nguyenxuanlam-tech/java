package TH_BUOI7;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, temp;
		
		do {
			System.out.println("Hay nhap number: ");
			number = sc.nextInt();
			
			System.out.printf("Uoc so chung cua %d la : \n\t",number);
			for(int i = 1; i <= number; i++) {
				if(number % i == 0 && i != number) {
					System.out.printf(i+"\t");
				}
			}
			
			System.out.printf("\nBan co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
	}

}
