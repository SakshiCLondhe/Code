//Array
import java.io.*;
import java.util.*;
class Code1{
	public static void main(String args [])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int size =Integer.parseInt(br.readLine());
	int arr[]=new int [size];
	int Sum=0;
	for (int i=0;i<size;i++){
		arr[i]=Integer.parseInt(br.readLine());
	}
	for (int i=0;i<size;i++){
		if(arr[i]%2==1){
			Sum=Sum+arr[i];
		} }
	System.out.println("Sum="+Sum);
	}
}




		
