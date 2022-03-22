package TH_BUOI6;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.println("Hay nhap n[a!=0]: ");
            n = sc.nextInt();
        }while(n==0);
		
		for(int i = 0; i<=n; i++) {
			if(i % 2 !=0) {
				sum += i;
			}
		}
		System.out.printf("sum = %d", sum);
	}

}
