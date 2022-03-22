package TH6_OnTap;

import java.util.Scanner;

public class Bai1 {
	
	public static void giaiPTBac1(float a,float b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Vo so nghiem");
			}else {
				System.out.println("Vo nghiem");
			}
		}else {
			float nghiem = -b/a;
			System.out.println("x = " +nghiem);
		}
	}
	
	public static void main(String[] args) {
		float a, b;
//		double nghiem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap a:");
		a = sc.nextInt();
		System.out.println("Moi nhap b:");
		b = sc.nextInt();
		giaiPTBac1(a, b);
		
		
	}

}
