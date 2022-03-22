package LT_Buoi6;

public class HoTap {

	public static void main(String[] args) {
		float cs = 0, cn = 0, nn = 0, dtb = 0;
		int chon = 0;
		do {
			System.out.println("Chuong trinh Xep Loai hoc tap.");
			System.out.println("---1. Nhap diem 3 mon('Co So - Chuyen Nghanh - Ngoai Ngu')   -----");
			System.out.println("---2. Tinh diem Trung Binh                                   -----");
			System.out.println("---3. Xep Loai                                               -----");
			System.out.println("---4. Ket qua [Dau : Rot]                                    -----");
			System.out.println("---5. Thoat Chuong Trinh                                     -----");
			
			chon = ThuVien.inputInt("Ban hay chon chuc nang");
			switch(chon) {
				case 1:{
					do {
						cs = ThuVien.inputFloat("Diem mon Co So.");
						cn = ThuVien.inputFloat("Diem mon Chuyen Nghanh.");
						nn = ThuVien.inputFloat("Diem mon Ngoai Ngu.");
						if(ThuVien.KiemTra(cs, cn, nn)) {
							System.out.println("Diem nhap vao khong hop le!");
						}
					}while(ThuVien.KiemTra(cs, cn, nn));
					break;
				}
				case 2:{
					ThuVien.tinhDTB(cs, cn, nn);
					break;
				}
				case 3:
					ThuVien.XepLoai(dtb);
					break;
				case 4:
					ThuVien.KetQua(dtb);
					break;
			} 
		}while(chon != 5 );
	}

}
