package LT_BUOI4;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		/*
		 * 		Viết chương trình, cho phép nhập vào chỉ số đọc được trên 1 số đồng hồ đo nước ở một hộ dân tại hai thời điểm
		 * (tạm gọi là thơi điểm cũ và thời điểm mới). Chương trình sẽ tính số m^3 nước đã tiêu thụ và tiền nước phải trả.
		 * 			- biết rằng 1 m^3 có giá 9000 đ áp dụng cho 10m^3 đầu tiên
		 * 			- từ m^3 thứ 11 thì giá 1m^3 nước sẽ tăng 1.5 lần
		 * */
		int oldNumber, newNumber, temp, pice = 9000;
		double totalMoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ban hay nhap chi so cu\n\t");
		oldNumber = sc.nextInt();
		System.out.println("Ban hay nhap chi so moi\n\t");
		newNumber = sc.nextInt();
		
		do {
			System.out.println("*================================================*");
			System.out.println("*=====================Hoa don====================*");
			
			temp = newNumber-oldNumber;
			if(temp <= 10) {
				totalMoney = (double) temp*pice;
			}else {
				totalMoney=(double) temp*(pice*1.5);
			}
			
			System.out.println("*=====     Chỉ số cũ: " + oldNumber+"        =====*");
	        System.out.println("*=====     Chỉ số mới: " + newNumber+"       =====*");
	        System.out.println("*=====     Số tiền phải trả: " + totalMoney+" vnd.=====*");
		}while(oldNumber>newNumber);		
	}

}
