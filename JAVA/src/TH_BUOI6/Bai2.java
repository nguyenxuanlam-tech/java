package TH_BUOI6;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.println("Hay nhap a [a>b]: ");
            a = sc.nextInt();
            System.out.println("Hay nhap b [a>b]: ");
            b = sc.nextInt();
        }while(a > b);
		
        for(int i = a ; a <= b; a++) {
            System.out.printf("%d \t", a);
        }
	}

}
