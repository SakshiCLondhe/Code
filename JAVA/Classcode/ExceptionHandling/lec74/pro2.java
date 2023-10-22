// Array Index Out Of Boudes 
import java.io.*;
class Demo{
	public static void main(String args []) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]= new int [size];
		for (int i=0;i<=size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			}
	}
}

