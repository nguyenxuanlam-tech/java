package TH_BUOI6;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		int a, b;
		long Sum;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.println("Hay nhap a[a!=0 && b!=0]: ");
            a = sc.nextInt();
            System.out.println("Hay nhap b[a!=0 && b!=0]: ");
            b = sc.nextInt();
        }while(a==0 && b==0);
		Sum = a+b;
		System.out.println("Sum = " +Sum);
        
	}

}
