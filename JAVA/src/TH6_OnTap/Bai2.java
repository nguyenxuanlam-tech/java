package TH6_OnTap;

import java.util.Scanner;

public class Bai2 {
	
	public static void giaPTBac2(float a, float b, float c) {
		float delta, nghiem;
		if(a == 0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Vo so nghiem");
				}else {
					System.out.println("Vo nghiem");
				}
			}else {
				nghiem = (-c/b);
				System.out.println("x = " + nghiem);
			}
		}else {
			delta = (float) Math.pow(b, 2) - (4*a*c);
			if(delta < 0) {
				System.out.println("Chuong trinh vo nghiem.");
			}else if(delta == 0) {
				nghiem = -b/(2*a);
				System.out.println("Chuong trinh co nghiem kep x = "+ nghiem);
			}else {
				nghiem = (float) (-b + Math.sqrt(delta))/(2*a);
				System.out.println("Nghiem phan biet x1 = "+ nghiem);
				nghiem = (float) (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Nghiem phan biet x2 = " + nghiem);
			}
		}
	}

	public static void main(String[] args) {
		int a, b, c, chon = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Hay nhap a:");
			a = sc.nextInt();
			System.out.println("Hay nhap b:");
			b = sc.nextInt();
			System.out.println("Hay nhap c:");
			c = sc.nextInt();
			
			giaPTBac2(a, b, c);
			
			System.out.println("Ban co muon tiep tuc [1;0]");
			chon = sc.nextInt();
		}while(chon != 0);
	}

}
