import java.util.*;
import java.util.Arrays;
class Code3{
	static int searchInsert(int nums[], int target){
		 Arrays.sort(nums);
	    int n=nums.length;
		for( int i=0;i<nums.length;i++)
	    {
		   if(target<=nums[i]){
			   return i;
		   }
	    }
	   return  n; 
      	}

        public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		  int nums[]=new int[]{1,3,5,6};
		  int  target=sc.nextInt();
		  System.out.println(searchInsert(nums, target));

	 }
}

