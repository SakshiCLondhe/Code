import java.io.*;
class Product{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int product=1;
                   int arr[]=new int [size];
		   for (int i=0 ;i<size;i++){
			   arr[i]=Integer.parseInt(br.readLine());
			   if(arr[i]%2==0){
			   product=product*arr[i];
			   }
		   }
		   System.out.println(product);
	}
}


