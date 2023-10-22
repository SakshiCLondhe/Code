//Array
import java.io.*;
class Code2{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		boolean arr[]=new boolean [size];
		for (int i=0;i<=size;i++)
		{ 
			arr[i]=Boolean.parseBoolean(br.readLine());
			System.out.println(arr[2]);
		}
                


	}
}


