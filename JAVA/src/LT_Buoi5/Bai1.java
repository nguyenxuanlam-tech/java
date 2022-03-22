package LT_Buoi6;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		/*
		 * Bài 1:
		 * 		cho người dùng nhập vào một số nguyên bất kỳ.
		 * 			chương trình cần phải xem xét xem số đó có phải là số nguyên tố không 
		 * 			=> xuất ra thông báo kết quả
		 * 			, hỏi có muốn tiếp tục kiểm tra hay tiêos hay không? [1,0]
		 * */
		Scanner sc = new Scanner(System.in);
		int n, check;
		
		do {
			do {
				System.out.println("Hay nhap so nguyen n > 2");
				n = sc.nextInt();
				
				if(n == 2  || (n != 2 && n % 1 == 0 && n % n == 0 && n % 2 != 0)) {
					System.out.printf("%d la SNT. \n", n);
				}else {
					System.out.printf("%d khong phai la SNT.\n",n);
				}
				
			}while (n < 2);
			System.out.println("Ban co muon tiep tuc khong [1:0]?");
			check = sc.nextInt();	
			System.exit(0);
		}while(check != 0);
		
	}

}
