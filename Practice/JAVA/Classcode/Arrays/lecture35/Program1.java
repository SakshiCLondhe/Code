//Array
import java.io.*;
class Code1{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int count=0;
		int arr[]=new int [size];
		for (int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			count++;
		}
		System.out.println("Count="+count);
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
			
         	}
		
	}
}


