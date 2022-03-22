package LT_BUOI4;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		int numberA, numberB, numberC, maxValue;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Nhap so thu nhat: \n\t");
		numberA = sc.nextInt();
		System.out.printf("Nhap so thu hai: \n\t");
		numberB = sc.nextInt();
		System.out.printf("Nhap so thu ba: \n\t");
		numberC = sc.nextInt();
		
		maxValue = numberA;
		if (maxValue < numberB)
        {
            maxValue = numberB;
        }
		if (maxValue < numberC) {	
			maxValue = numberC;
		}
		System.out.printf("number: %d \t numberB: %d \t numberC: %d \n\t maxValue: %d",numberA, numberB, numberC, maxValue);
	}

}
