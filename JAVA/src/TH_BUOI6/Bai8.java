package TH_BUOI6;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
	    int number;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Hay nhap so ma ban muon tim uoc: ");
	    number = sc.nextInt();
	    
	    System.out.printf("\n\nCac uoc cua number = %d là.\n",number);
	    
	    for(int i = 1; i <= number; i++){
	      if(number % i == 0){
	        System.out.printf(i + "\t");
	      }
	    }
	}

}
