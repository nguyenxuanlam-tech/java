package TH_BUOI7;

import java.util.Scanner;

public class Bai4Method {
	
	public static int sum(int n) {
		if (n == 1) return 1;
	    if (n % 2 != 0) {
	        return sum(n - 1);
	    } else {
	        return n + sum(n - 1);
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, temp;
		
		do {
			System.out.println("Hay nhap so n: ");
			n = sc.nextInt();
			
			System.out.printf("Tong so le tu [1:%d] la %d. \n", n,sum(n));
			
			System.out.println("Ban co muon tiep tuc khong? [0:1]");
			temp = sc.nextInt();
		}while(temp != 0);
		
	}

}
