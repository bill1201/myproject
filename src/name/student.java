package name;

public class student {
	int Math ;
	int English ;
	int Chinese ;
	String name ;	
	public void print(){
		System.out.println(English +"\t"+ Math +"\t" + Chinese +"\t");
		
	}
	public Student(String n,int e, int m,int c){
		name=n;
		Math=e;
		English=m;
		Chinese=c;
		
	}
	public int getAverage(){
		return(English+Math+Chinese)/3;
	}
}
