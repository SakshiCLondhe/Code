//passing value to function
import java.util.*;
class Demo1{
	static void  add(int a,int b){
		int add=a+b;
		System.out.println("add="+add);
	}
	static void sub(int a, int b){
		int sub=a-b;
		System.out.println("sub="+sub);
	}
	static void  mul(int a, int b){
		int mul =a*b;
		System.out.println("mul="+mul);
	}
	static void div(int a , int b){
		int div =a/b;
		System.out.println("div="+div);
	}
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
			int a =sc.nextInt();
			int b=sc.nextInt();
			add(a,b);
			sub(a,b);
			mul(a,b);
			div(a,b);

		}
	}
