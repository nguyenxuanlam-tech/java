package LT_BUOI3;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*if{...}else{...} vd1:*/
//		int soCu, soMoi, tieuThu, tongTien;
//		
//		System.out.printf("Bạn hãy cung cấp số cũ \n\t");
//		soCu = sc.nextInt();
//		System.out.printf("Bạn hãy cung cấp số mới \n\t");
//		soMoi = sc.nextInt();
//		
//		if(soCu >= 0 && soCu <= soMoi) {
//			tieuThu = soMoi-soCu;
//			if(tieuThu < 101) {
//				tongTien = 1200 * tieuThu;
//				System.out.printf("So tieu thu = {0}, Tong tien phai tra = {1}vnd", tieuThu, tongTien);
//			}else if(tieuThu >= 101 && tieuThu <= 249) {
//				tongTien = 1500 * tieuThu;
//				System.out.printf("So tieu thu = {0}, Tong tien phai tra = {1}vnd", tieuThu, tongTien);
//			}else if(tieuThu >= 250 && tieuThu <= 400) {
//				tongTien = 2300 * tieuThu;
//				System.out.printf("So tieu thu = {0}, Tong tien phai tra = {1}vnd", tieuThu, tongTien);
//			}else {
//				tongTien = 3000 * tieuThu;
//			System.out.printf("So tieu thu = {0}, Tong tien phai tra = {1}vnd", tieuThu, tongTien);
//			}
//		}
		
		/*if{...}else{...} vd2:*/
		double kinhNghiem;
		float Luong;
		
		System.out.printf("Bạn hãy nhập số năm kinh nghiệm của mình vào đây.\n\t");
		kinhNghiem = sc.nextDouble();
		System.out.printf("Bạn hãy nhập số lương một tháng của bạn vào đây.\n\t");
		Luong = sc.nextFloat();
		
		if(kinhNghiem >= 0 && Luong > 0) {
			if(kinhNghiem <=3) {
				System.out.printf("Số năm kinh nghiệm của bạn là = "+kinhNghiem+", với mức lương = "+Luong+"vnd ==> thưởng của bạn là: 1.000.000vnd");
			}else if( Luong <= 5000000) {
				System.out.printf("Số năm kinh nghiệm của bạn là = "+kinhNghiem+", với mức lương = "+Luong+"vnd ==> thưởng của bạn là: 2.500.000vnd");
			}else {
				System.out.printf("Số năm kinh nghiệm của bạn là = "+kinhNghiem+", với mức lương = "+Luong+"vnd ==> thưởng của bạn là: "+ Luong );
			}
		}
	}

}
