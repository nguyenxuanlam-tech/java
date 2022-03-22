package BUOI2;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		int hour, minute, second, n;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Hãy nhập số giây cần đổi: ");
		n = sc.nextInt();
		
		hour = n /3600;
		minute = n % 3600 / 60;
		second = n % 3600 % 60;
		
		System.out.printf("Sau khi đổi từ %d giây: %d:%d:%d",n,hour,minute,second);
	}

}
