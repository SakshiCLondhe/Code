// Calculate profit and loss 
 class Assignment7{
	 public static void main (String args []){
	        float sellingprice =1200f;
		float costprice =700f;
	      
	       	if (sellingprice>costprice){
		       float price= sellingprice-costprice;
	               System.out.println(price+"is profit");
	               }
		else if(sellingprice <costprice){
	             float price= costprice-sellingprice;
                     System.out.println(price+"is loss");
 			}
	        else{
			System.out.println("neither profit neither loss");
		}
	 }
 }
