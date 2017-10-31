package Myproject;

import java.util.Scanner;

public class agetester {

	public static void main(String[] args) {
		System.out.println("請輸入你的年齡");
        Scanner scanner = new Scanner (System.in);
        String line = scanner.nextLine();
        int age = Integer.parseInt(line);
        if (age<12){
        	System.out.println("小學嗎?");
        	
        }else{
        	if (age<15){
            System.out.println("中學嗎?");
        	}else{
        	if (age<18){
        	System.out.println("高中?");
        	
        	}else{
        		System.out.println("...");
        	}
        	}
        }
	}

}
