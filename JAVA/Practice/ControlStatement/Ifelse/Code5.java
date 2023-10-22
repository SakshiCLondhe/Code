import java.util.*;
class Code5{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
	int SPrice =sc.nextInt();
	int CPrice=sc.nextInt();
	int Price =SPrice- CPrice;
	if(SPrice>CPrice){
		System.out.println("Profit of"+Price);
	}
	else if(SPrice<CPrice){
		System.out.println("Loss of"+Price);
	}
	}
}
