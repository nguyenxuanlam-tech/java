package LT_BUOI4;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		int marks[] = new int[6];
        int i,n;
        float total=0, avg;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số môn học cần tính: ");
        n = scanner.nextInt();
            for(i=0; i<n; i++) {
                System.out.print("Nhập vào điểm của môn thứ "+(i+1)+": ");
                marks[i] = scanner.nextInt();
                total = total + marks[i];
            }
        scanner.close();
        avg = total/n;
        System.out.println("Điểm trung bình của "+ n + " môn học trên là: "+avg);
        System.out.print("Xếp loại của bạn là: ");
        if(avg>=8.5)
        {
            System.out.print("Giỏi");
        }
        else if(avg>=7 && avg<8.5)
        {
            System.out.print("Khá");
        }
        else if(avg>=5 && avg<7)
        {
            System.out.print("Trung Bình");
        }
        else
        {
            System.out.print("Yếu");
        }
        System.out.println();
        System.out.println("----------------------------");
	}

}
