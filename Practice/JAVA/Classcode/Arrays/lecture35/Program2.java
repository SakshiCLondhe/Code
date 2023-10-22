//Array
import java.io.*;
class Code2{
	public static void main(String []a)throws IOException{
 	int size=Integer.parseInt(br.readLine());
	System.out.println("Size of array="+size);
	int arr[]=new int [size];
	int even=0;
	int odd=0;
	for (int i=0;i<size;i++){
		arr[i]=Integer.parseInt(br.readLine());
 		if(arr[i]%2==0){
			even++;}
			System.out.println("Even count="even);
		

                else{
			System.out.println("oddcount="odd);
		}
	}
}

}
