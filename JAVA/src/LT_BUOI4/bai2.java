package LT_BUOI4;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		/*
		 *		Chương trình cho phép người dùng nhập vào tên và giới tính 1 người
		 *			-Sau đó in ra lời chào trên màn hình. 
		 * */
		
		String name, gioiTinh;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ban vui long dien vao ten cua minh vao day nhe.\n\t");
		name = sc.nextLine();
		System.out.printf("Ban hay dien gioi tinh vao day nhe.\n\t");
		gioiTinh = sc.nextLine();
		
		if(gioiTinh == "nữ" || gioiTinh=="nu" || gioiTinh=="Nu" || gioiTinh=="Nữ" || gioiTinh=="girl" || gioiTinh=="Girl") {
			System.out.println("Rat han hanh duoc gap chi " + name);
		}
		if(gioiTinh == "nam" || gioiTinh == "Nam" || gioiTinh == "boy" || gioiTinh == "Boy" || gioiTinh == "men" || gioiTinh == "Men") {
			System.out.println("Xin chao anh " + name);
		}
		System.out.println("Hello che.");
	}

}
