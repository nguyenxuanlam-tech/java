package TH_BUOI3;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		/*
		 * 		==>	Viết chương trình Java cho phép người sử dụng chọn câu trả lời (giống như chương trình thi trắc nghiệm). 
		 * 				Ví dụ màn hình hiển thị như sau:
		 * 					Cách nào khai báo một biến và gán giá trị số nguyên là đúng trong các câu lệnh C# sau?
		 * 						a. int 1x=10;
		 * 						b. int x=10;
		 * 						c. float x=10.0f;
		 * 						d. string x=”10″;
		 * 					Chọn ký tự để trả lời: c Lựa chọn không đúng!

		 * */
		char result, con = 'y';
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Cách nào khai báo một biến và gán giá trị số nguyên là đúng trong các câu lệnh C# sau?");
        System.out.println("a. int 1x=10;");
        System.out.println("b. int x=10;");
        System.out.println("c. float x=10.0f;");
        System.out.println("d. string x=”10″;");
         
        do {
            System.out.println("Nhập vào câu trả lời: ");
            result = scanner.next().charAt(0);
             
            if (result == 'a' || result == 'b' || result == 'd') {
                System.out.println("Kết quả đúng!");
                break;  // thoát khỏi vòng lặp nếu chọn đáp án đúng
            } else if (result == 'e') {
                // nếu người dùng nhấn phím 'q' thì sẽ kết thúc chương trình
                System.out.println("Thoát chương trình!");
            } else if ( result == 'c' ) {
                System.out.println("Bạn chọn không đúng!");
            } else {
                System.out.println("Câu trả lời phải nằm trong 4 lựa chọn a, b, c hoặc d.");
            }
            System.out.println("Đoán lại? Nhấn phím y để tiếp tục, nhấn e để thoát!");
            con = scanner.next().charAt(0);
            if (con == 'e') {
                System.out.println("Thoát chương trình!");
            }
             
        } while (con == 'y'); // nếu người dùng nhấn phím 'y' thì quay lại thực hiện vòng lặp
	}

}
