
import java.io.*;
class Code7{
	public static void main(String args [])throws IOException {
		BufferedReader br = new BufeferedReader(new InputStreamReader(System.in));
		int size1 = Integer.parseInt(br.readLine());
		int size2 Integer.parseInt(br.readLine());
		int arr1[]=new int [size1];
		int arr2[]=new int [size2];
		for(int i=0;i<size1;i++){
                    		arr1[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
		        	arr2[i]=Integer.parseInt(br.readLine());

                }
		int flag =0;
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){
		if(arr1[i]==arr2[j]){
			flag=1;
		}
			}
		     if(flag ==0){
				System.out.println(arr[i]);
			}
		     flag=0;

		}






