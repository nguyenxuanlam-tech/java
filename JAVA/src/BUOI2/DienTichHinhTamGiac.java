package BUOI2;

import java.util.Scanner;

public class DienTichHinhTamGiac {
	
	public static double DienTich(double canhDay,double chieuCao) {
        return (canhDay * chieuCao)/2;
    }
	
	public static void main(String[] args) {
		double canhDay,chieuCao;
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hãy nhập chiều dài cạnh đáy: ");
        canhDay = scanner.nextDouble();
        System.out.println("Hãy nhập chiều cao: ");
        chieuCao = scanner.nextDouble();
        System.out.println("Diện tích hình Tam Gíac: " + DienTich(canhDay,chieuCao));
	}

}
