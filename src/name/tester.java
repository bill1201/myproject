package name;

import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student("王曉明",55,66,77) ;
		 //student stu  =new student("王曉明");
	
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int i=0;i<customers.size();i++){
			Customer c =customers.get(i);
			c.print();
		}
		
		
		
		
		
		
		//stu.print();
		//int avg =stu.getAverage();
		//System.out.println("王小明"+avg);
		//GraduateStudent gstu = new GraduateStudent();
		//gstu.print();
	
		ArrayList<Integer> list = new ArrayList<>();
		list.add(94);
		list.add(80);
		list.add(96);
		list.add(4);
		int n =list.get(2);
        int n2 =list.get(3);		
		System.out.println(list.get(1));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	
	
	
	}
	
	
	
	

}
