import java.util.*;
class Code3{
	public static void main(String args [])
	{
		Scanner sc = new Scanner (System.in);
		 int no= sc.nextInt();
		if(no==0){

			System.out.println("Zero");
		}
		else if(no==1){
			System.out.println("One");
		}
		else if(no==2){
			System.out.println("Two");
		}
		else if(no==3){
			System.out.println("Three");
		}
		else if(no==4){
			System.out.println("Four");
		}
		else if(no==5){
			System.out.println("Five");
		}
		else if(no>5){
                      System.out.println(" no is greater ");
		}
		else if(no<0){
			System.out.println(" is negative");
		}

	}
}


