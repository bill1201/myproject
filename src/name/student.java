package name;

import org.omg.CORBA.PUBLIC_MEMBER;

public class student {
	String name;
	int english;
	int math;
	int chinese;

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public student(String n, int e, int m, int c) {
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public student(String name){
		this.name = name;
				
		
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
