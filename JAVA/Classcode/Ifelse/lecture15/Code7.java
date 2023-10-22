//Given an integer value as input 
//print fizz if it divisible by 3
//print buzz if it divisible by 5
//print fizz-buzz if it is divisible by both
//if not then print not divisible by both
  class Ifelseladder{
	  public static void main(String args []){
		  int x=7;
		  if(x%3==0&& x%5==0){
			  System.out.println("fizz-Buzz");
		  }
		  else if(x%3==0){
			System.out.println("fizz");
		  }
		  else if (x%5==0){
			  System.out.println("Buzz");
		  }
		  else{
	               System.out.println("Not divisible by both");
	  }
  }
  }
