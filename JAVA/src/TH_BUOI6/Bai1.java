package TH_BUOI6;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.println("Hay nhap so lan ban muon in ra [n>0]: ");
            n = sc.nextInt();
        }while(n == 0);
         
        for(int i = 1; i <= n; i++) {
            System.out.printf("%d \t", i);
        }
         
        
	}

}
