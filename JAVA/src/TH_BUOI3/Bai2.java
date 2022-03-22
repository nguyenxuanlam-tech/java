package TH_BUOI3;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		/*
		 * 		==>	Nhập vào giờ, phút, giây. 
		 * 			Kiểm tra xem giờ, phút, giây đó có hợp lệ hay không? 
		 * 			In kết quả ra màn hình
		 * */
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, second; //Khai báo biến
		
		System.out.printf("Nhap gio:\t\n\t");
		hour = sc.nextInt(); // nhập dữ liệu
		System.out.printf("Nhap phut:\t\n\t");
		minute = sc.nextInt(); // nhập dữ liệu
		System.out.printf("Nhap giay:\t\n\t");
		second = sc.nextInt(); // nhập dữ liệu
		
		if((hour >= 0 && hour <= 23)&&(minute >= 0 && minute <= 59)&&(second >= 0 && second <=59)) {
			System.out.printf("Thoi gian ban nhap co phai: %d gio %d phut %d giay?", hour, minute, second); // xuất ra kết quả
		}else {
			System.out.printf("Thoi gian ban nhap vao khong hop le\t\n\t '0 <= Gio >= 23' \t\n\t '0 <= Phut >=59' \t\n\t '0 <= 0 >= 59'");
		}
		
	}

}
