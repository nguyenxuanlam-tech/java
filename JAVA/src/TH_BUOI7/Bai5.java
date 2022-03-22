package TH_BUOI7;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		
		System.out.println("Cac so [1:1000] co tan cung la so 0: ");
		for(int i = 1; i < 1000; i++) {
			if(i % 10 == 0) {
				System.out.printf("\t %d \n", i);
			}
		}
	}

}
