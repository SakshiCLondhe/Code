// Array
import java.io.*;
class Code3{
	public static void main(String args [])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int size=Integer.parseInt(br.readLine());
       float arr[]=new float[size];
       for(int i=0;i<size;i++){
	       arr[i]=Float.parseFloat(br.readLine());
       }
       for(int i=0;i<size;i++){
       {
	       System.out.println(arr[i]);
       }
       }	}
}
