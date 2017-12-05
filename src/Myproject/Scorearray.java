package Myproject;

public class Scorearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m [][]=new int[5][3];
m[0][0]=80 ;
m[0][1]=81 ;
m[0][2]=82 ;
m[1][0]=83 ;
m[1][1]=30 ;
m[1][2]=40 ;
m[2][0]=50 ;
m[2][1]=60 ;
m[2][2]=50 ;
m[3][0]=40 ;
m[3][1]=30 ;
m[3][2]=60 ;
m[4][0]=40 ;
m[4][1]=90 ;
m[4][2]=20 ;
	
	for(int i=0;i<5;i++){
		System.out.print(m[i][0]+ "\t"+ m[i][1]+"\t"+ m[i][2]);
		int average =((m[i][0]+m[i][1]+m[i][2])/3);
if(average<60){
	System.out.println("\t"+"*"+average);	
}else{
System.out.println("\t"+average);
}
}
}
}