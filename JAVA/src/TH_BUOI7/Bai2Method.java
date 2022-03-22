package TH_BUOI7;

import java.util.Scanner;

public class Bai2Method {

	public static double tinhDienTich(double r) {
        return r * r * 3.14;
    }
	
    public static double tinhChuVi(double r){
        return r * 2 * 3.14;
    }
	
	public static void main(String[] args) {
		int temp;
		double r;
        Scanner scanner = new Scanner(System.in);
				
		do {
			System.out.println("Nhập bán kính hình tròn: ");
	        r = scanner.nextDouble();
	        System.out.println("Diện tích hình tròn là: " + tinhDienTich(r));
	        System.out.println("Chu vi hình tròn là: "+ tinhChuVi(r));
			
			System.out.println("Ban co muon tiep tuc khong? [0:1]");
			temp = scanner.nextInt();
		}while(temp != 0);
	}

}
