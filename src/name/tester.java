package name;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student("王曉明",55,66,77) ;
		 //student stu  =new student("王曉明");
	
		stu.print();
		int avg =stu.getAverage();
		System.out.println("王小明"+avg);
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	
	
	
	
	}
	
	
	
	

}
