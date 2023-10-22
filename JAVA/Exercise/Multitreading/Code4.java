class one{
	public static void main(String args []){
		int nums[]={1,1,2};
		int k= nums.length;
		int j=1 ;
		for(int i=0;i<nums.length-1;i++){
			if(nums[j]!=nums[i+1]){
				nums[j]=nums[i+1];
				j++;
			}
		}
		for(int i=0;i<nums.length;i++){
			nums[i]=nums[i];
		}
		}
	}



