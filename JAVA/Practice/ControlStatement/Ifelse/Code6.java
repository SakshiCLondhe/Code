import java.util.*;
class Code6{
	public static void main(String args []){
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c= sc.nextInt();
	if(a*a+b*b==c*c ||b*b==a*a+ c*c || a*a==b*b+c*c){
		System.out.println("Triangle is Pythagorean Triplet");
	}
	else {
		System.out.println("Triangle is Not a Pythagorean  Triplet");
	}
	}
}
