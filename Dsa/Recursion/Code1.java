import java.util.*;
class Code1{
	int cnt =0;
	 int Fun(int x)
	{
	    if( x ==0){
    			return 1 ;
	    }
            
	    

	    Fun(--x);
            cnt++;
	    System.out.println(x);
	    return cnt;
	    
	}
	   
	
	 public static void main(String args []){
		 Code1 obj = new Code1();
		 int resu= obj.Fun(5);
		 System.out.println(resu);
		 
	 }
}

