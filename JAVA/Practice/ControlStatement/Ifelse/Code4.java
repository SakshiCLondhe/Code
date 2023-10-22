import java.util.*;
class Code4{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	int month =sc.nextInt();
	if( month==1){
		System.out.println( "Jan has 31 days");
	}
	else if(month ==2){
		System.out.println("Feb  has 28 or 29 days");
	}
	else if(month ==3){
		System.out.println("march has 31 days");
	}
	else if(month==4){
		System.out.println("apr has 30 days");
	}
	else if(month==5){
		System.out.println("may has 31 days");
	}
	else if(month==6){
		System.out.println("june has 30 days");
	}
	else if(month==7){
		System.out.println(" july has 31 days");
	}
	else if(month==8){
		System.out.println("Aug has 31 days");
	}
	else if(month==9){
		System.out.println("Sep has 30 days");
	}
	else if(month==10){
		System.out.println("Oct has 31 days");
	}
	else if(month==11){
		System.out.println("Nov has 30 days");
	}
	else if(month==12){

		System.out.println("Dec has 31 days");
	}
	else if(month<12&&month<=0){
		System.out.println("invalid month");
	}

	}
}
