package Myproject;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數子");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 ==1){
			System .out.println("是奇數orz");
			
		}else{
			System.out.println("是偶數~");
	}
		
	}

}
