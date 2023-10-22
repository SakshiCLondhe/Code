import java.util.*;
interface Code1{
	void fun();
	void gun();


}
class Code1demo implements Code1 {
		public void fun(){
			 System.out.println("in fun");

		 }
		 public void gun(){
		 System.out.println("in gun");
		 }
	 }

class Code2demo {
	public static void main(String args[]){
		Code1 obj= new Code1demo();
		obj.fun();
		obj.gun();
	}
}

