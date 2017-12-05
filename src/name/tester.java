package name;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu = new student() ;
		stu.Chinese = 55;
		stu.English = 65;
		stu.Math = 80;
		stu.print();
		int avg =stu.getAverage();
		System.out.println("¤ı¤p©ú"+avg);
	}

}
