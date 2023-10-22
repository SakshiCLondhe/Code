//produvt of odd index
import java.io.*;
class Code3{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entersize");
		int size =Integer.parseInt(br.readLine());
		int a[]=new int [size];
		int pro=1;
		System.out.println("Enter array element");
		for (int i=0;i<=size;i++)
		{
	        a[i]= Integer.parseInt(br.readLine());
		if(i%2!=0)
		{
		 pro= pro*a[i];
		}
		}
		System.out.println("Array prod  Elements="+pro);
		}	
	
}
