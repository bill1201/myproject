package Myproject;

import java.util.Scanner;

public class agetester {

	public static void main(String[] args) {
		System.out.println("�п�J�A���~��");
        Scanner scanner = new Scanner (System.in);
        String line = scanner.nextLine();
        int age = Integer.parseInt(line);
        if (age<12){
        	System.out.println("�p�Ƕ�?");
        	
        }else{
        	if (age<15){
            System.out.println("���Ƕ�?");
        	}else{
        	if (age<18){
        	System.out.println("����?");
        	
        	}else{
        		System.out.println("...");
        	}
        	}
        }
	}

}
