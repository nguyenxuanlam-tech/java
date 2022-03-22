package TH_BUOI3;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		
		/*
		 * 	==>	Viết chương trình Java kiểm tra bàn phím khi ấn xuống. 
		 * 			Nếu người dùng ấn một phím (từ 0 tới 9) 
		 * 				thì chương trình sẽ hiển thị số số được nhấn này, 
		 * 				ngược lại hiển thị “Phím bạn ấn không phải là số!”.

		 * */
		Scanner sc = new Scanner(System.in);
		
		char key;
		
        System.out.println("An mot so tren ban phim:");
        key = sc.next().charAt(0);
        switch (key)
        {
        	case '0': System.out.println("Bạn đã ấn số 0"); break;
        	case '1': System.out.println("Bạn đã ấn số 1"); break;
        	case '2': System.out.println("Bạn đã ấn số 2"); break;
        	case '3': System.out.println("Bạn đã ấn số 3"); break;
        	case '4': System.out.println("Bạn đã ấn số 4"); break;
        	case '5': System.out.println("Bạn đã ấn số 5"); break;
        	case '6': System.out.println("Bạn đã ấn số 6"); break;
        	case '7': System.out.println("Bạn đã ấn số 7"); break;
        	case '8': System.out.println("Bạn đã ấn số 8"); break;
        	case '9': System.out.println("Bạn đã ấn số 9"); break;
        	default: System.out.println("Phím bạn ấn không phải là số!"); break;
        }
	}

}
