package name;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student("�����",55,66,77) ;
		 //student stu  =new student("�����");
	
		stu.print();
		int avg =stu.getAverage();
		System.out.println("���p��"+avg);
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	
	
	
	
	}
	
	
	
	

}
