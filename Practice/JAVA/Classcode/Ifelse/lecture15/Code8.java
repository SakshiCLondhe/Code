//Electricity Bill Problem 
//Given an integer input A which reprents unit of electricity consumed at your house 
//Calcute and print the bill amount 
 // unit <=100: price per unit is 1 input-50 output-50 
 // unit >100: price per unit is 2  input-200 output -300
class Electricity{
	public static void main(String args []){
		int unit = 200;
		if(unit <=100)
		{
			System.out.println(unit*1);
		}
		else
		{
			System.out.println(100*1+(unit-100)*2);
		}
	}
}

