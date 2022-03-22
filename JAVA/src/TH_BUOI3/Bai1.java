package TH_BUOI3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		
		/*
		 * 		==> Viết chương trình nhập vào số nguyên n gồm ba chữ số. 
		 *			Xuất ra màn hình theo thứ tự tăng dần của các chữ số.
		 * */
		Scanner sc = new Scanner(System.in);
		
		int n, a, b, c, tam;

		System.out.printf("Nhap so nguyen n co 3 chu so:\t\n\t");
		n=sc.nextInt();
		if(n > 0) {
			a = n / 100; //tách lấy số hàng trăm
			b = ((n % 100) /10); //tách lấy số hàng chục
			c = n % 10; //tách lấy số hàng đơn vị
			//xử lý so sánh các phần tử thuộc các hàng đơn vị trăm, chục, đơn vị và sắp xếp
			if(a > b) {
				tam = a;
				a = b;
				b = tam;
			}
			if(b > c) {
				tam = b;
				b = c;
				c = tam;
			}
			if(a > b){
		     tam = a;
		     a = b;
		     b = tam;
		    }
			System.out.printf("%d%d%d",a,b,c);
		}
	}

}
