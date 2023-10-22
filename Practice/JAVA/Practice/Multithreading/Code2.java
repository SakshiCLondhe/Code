//creating thread Using thread Class
import java.util.*;
class Code2 extends Thread{
	 public void run(){
		 for(int i=10;i<=20;i++){
			System.out.println(i);
		
		 }}
}

class Code2demo{	
	 public static void main(String args [])throws InterruptedException{
		 Code2 obj= new Code2();
		 obj.start();
		 obj.sleep(3000);
		 for( int i=0;i<=10;i++){
			 System.out.println(i);
		 }
	 }
}
