package BUOI2;

import java.util.Scanner;

public class Bai4 {
	
	public static void main(String[] args) {
		int hour, minute, second;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hãy nhập số giờ cần đổi: ");
		hour = sc.nextInt();
		System.out.println("Hãy nhập số phút cần đổi: ");
		minute = sc.nextInt();
		
		if(hour >= 0 && minute > 0) {
			second = hour * 3600 + minute * 60;
			System.out.println("Kết quả số giây đã được đổi là: " + second + " second");
		}else
			System.out.println("Nhập liệu không hợp lệ.");
	}

}
