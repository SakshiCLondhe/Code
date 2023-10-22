import java.io.*;
class P2{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int size= Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int prod=1;
		for (int i=0;i<=arr.length;i++);
		{
			 arr[i]=Integer.parseInt(br.readLine());
			if (arr[i]%2==0)
			{
			prod =prod*arr[i];	
                        }
		}
		System.out.println("prod"=+prod);
	}
}
