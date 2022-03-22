package TH_BUOI6;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.println("Hay nhap a [a>b]: ");
            a = sc.nextInt();
            System.out.println("Hay nhap b [a>b]: ");
            b = sc.nextInt();
        }while(a > b);
		
        for(int i = a ; i <= b; i++) {
            if(i % 3 != 0) {
            	continue;
            }
            System.out.printf("%d \t",i);
        }
	}

}
