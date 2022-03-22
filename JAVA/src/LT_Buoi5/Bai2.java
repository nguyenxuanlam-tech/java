package LT_Buoi6;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		/*
		 * Bài 2: 
		 * 		Viết chương trình cho phép in ra bảng cửu chương bất kỳ mà người dùng muốn.
		 * 			hỏi người dùng xem có muốn tiếp tục in lại bảng cửu chương khác hay không?
		 * */
		Scanner sc = new Scanner(System.in);
		int num, temp;
		
		do {			
			do {
				System.out.println("Hay muon in ra bang cuu chuomh may? [1, 2,..., 9]");
				num = sc.nextInt();
				System.out.printf("\t\tBang cuu chuong %d \n", num);
				for(int i = 1; i <= 10; i++) {
					System.out.printf("\t%d * %d = %d \n", num, i, (num*i));
				}
			} while(num == 0);
			
			System.out.println("Ban co muon in bang cuu chuong khac khong? [1:0]");
			temp = sc.nextInt();
			
		}while(temp != 0);
		System.exit(0);
	}

}
