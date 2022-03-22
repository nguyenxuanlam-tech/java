package BUOI2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soChuc, soDv, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hãy nhập số hàng chục.");
		soChuc = sc.nextInt();
		if(soChuc > 0) {
			System.out.println("Hãy nhập số hàng đơn vị.");
			soDv = sc.nextInt();
			if(soDv > 0) {
				sum = soChuc+soDv;
				
				System.out.println("Tổng của 2 số  là: " + sum);
			}else {
				System.out.println("Số hàng đơn vị phải lớn hơn 0.");
			}
		}else
			System.out.println("Số hàng chục phảo lớn hơn 0.");
	}

}
