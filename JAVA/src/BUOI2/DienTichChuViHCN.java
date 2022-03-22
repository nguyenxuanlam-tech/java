package BUOI2;

import java.util.Scanner;

public class DienTichChuViHCN {

	public static double ChuVi(double chieuDai, double chieuRong) {
		return (chieuDai+chieuRong)*2;
	}
	
	public static double DienTich(double chieuDai,double chieuRong) {
        return chieuDai * chieuRong;
    }
	
	public static void main(String[] args) {
		double dai,rong;
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hãy nhập chiều dài: ");
        dai = scanner.nextDouble();
        System.out.println("Hãy nhập chiều rộng: ");
        rong = scanner.nextDouble();
        
        System.out.println("chu vi hình chữ nhật là: " + ChuVi(dai, rong));
        System.out.println("diện tích hình chữ nhật là: " + DienTich(dai,rong));
	}

}
