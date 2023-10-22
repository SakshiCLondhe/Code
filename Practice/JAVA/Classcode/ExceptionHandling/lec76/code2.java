//user defined Exception handling
import java.util.Scanner;
class DataUnderFlowException extends RuntimeException{
         DataUnderFlowException(String msg){

		 super(msg);
	 }
}
class DataOverFlowException extends RuntimeException{
        DataOverFlowException(String msg){
		super(msg);
}
}
class Code{
	public static void main(String args []){
		int a[]=new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int value");

		System.out.println("note:0<element<100");
		for(int i=0;i<a.length;i++){
      			int data=sc.nextInt();
			if(data<0){
				throw new DataUnderFlowException("data is less than zero");
			}
			if(data>100){
				throw new DataOverFlowException("data is greater than 100");
			}
			a[i]=data;
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
		}


