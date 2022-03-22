package BUOI2;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập n 'tổng có bao nhiêu số'.: ");
        n = scanner.nextInt();
        if(n > 0 ) {
        	for (int count = 1; count <=n; count++) {
        		System.out.println("Nhập số thứ " + count + ": ");
        		number = scanner.nextInt();
        		sum += number;
        	}
         
        	avgNumber = (float) sum / n;
        	System.out.println("Trung bình cộng = " + avgNumber);
        }else
        	System.out.println("Nhập liệu không hợp lệ.");
        
	}

}
