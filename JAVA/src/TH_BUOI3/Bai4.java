package TH_BUOI3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		/*
		 * 		==>	Nhập vào 3 số nguyên dương. 
		 * 				Kiểm tra xem 3 số đó có lập thành tam giác không? 
		 * 				Nếu có hãy cho biết tam giác đó thuộc loại nào? (Cân, vuông, đều, …).
		 * */
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.printf("Nhap canh a:\t\n\t");
		a = sc.nextFloat();
		System.out.printf("Nhap canh b:\t\n\t");
		b = sc.nextFloat();
		System.out.println("Nhap canh c:\t\n\t");
		c = sc.nextFloat();
		
		if(a >= 0 && b >= 0 && c >= 0) {
			if((a+b <= c) || (a+c <= b) || (b+c <= a)) {
				System.out.println("Khong phai hinh tam giac");
			}else {
				if (a==b||a==c||b==c) {
					System.out.println("Tam giac vuong can");
				}else if (a!=b || a!=c || b!=c) {
					System.out.println("Tam giac can");
				}else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a){
					System.out.println("Tam giac deu");
				}else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a) {
					System.out.println("Tam giac vuong");
				} else {
					System.out.println("Tam giac binh thuong"); 
				}
			}
		}else {
			System.out.println("Du lieu khong hop le!");
		}
		
	}

}
