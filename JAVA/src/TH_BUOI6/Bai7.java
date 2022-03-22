package TH_BUOI6;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		int n;
		long giai_thua = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hay nhap n: ");
		n = sc.nextInt();
		
        if (n == 0 || n == 1) {
        	System.out.printf("Giai thua cua n = %d", giai_thua);
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            System.out.printf("Giai thua cua n = %d", giai_thua);
        }
	}

}
