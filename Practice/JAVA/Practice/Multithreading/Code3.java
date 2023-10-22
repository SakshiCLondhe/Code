import java.util.*;
class Code3{
	public void run(){
		System.out.println("in run");
	}
	public void start(){
		System.out.println("in start");
		run();
	}
}
class Code3demo{
	 public static void main(String args []){
		 Code3 obj= new Code3();
		 obj.start();
		 System.out.println(" in main");
	 }
}


