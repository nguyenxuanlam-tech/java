package TH_BUOI3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		
		/*
		 * 		==> Viết chương trình tính tiền cước TAXI. 
		 * 			Biết rằng:
		 * 				Km đầu tiên là 13000đ
		 * 				Mỗi km tiếp theo là 12000đ
		 * 				Nếu lớn hơn 30km thì mỗi km thêm sẽ là 11000đ
		 * 			Hãy nhập số km sau đó in ra số tiền phải trả
		 * */
		Scanner sc = new Scanner(System.in);
		
		float totalKm, cost = 0;
		
		System.out.printf("Nhap so km: \t\n\t");
		totalKm = sc.nextFloat();
		
		if(totalKm >= 0) {
			if(totalKm <= 1) {
				cost = 13000 * totalKm;
			}
			if(totalKm<30 && totalKm >1) {
				cost = 12000 * (totalKm-1) + 13000;
				
			}else{
				cost = 1*1300 + 29*12000 + (totalKm - 30) * 11000;
			}
			System.out.printf("Tong so KM: %d, Tong tien: %d", totalKm, cost);
		}else {
			System.out.printf("Du lieu khong hop le: %d < 0", totalKm);
		}
		
	}

}
