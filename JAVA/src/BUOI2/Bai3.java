package BUOI2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		double celsius; 
	    Scanner sc = new Scanner(System.in);
	         
	    System.out.println("Nhập vào độ Celcius cần đổi: ");
	    celsius = sc.nextDouble();
	         
	    double fahrenheit = (double) 9 / 5 * celsius + 32;
	    System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
	}

}
