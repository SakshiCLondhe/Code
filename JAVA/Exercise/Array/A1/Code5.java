import java.io.*;
class Code{
	public static void main(String arg [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size =Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
			if(arr[i]%5==0){
				System.out.print(arr[i]+" ");

		}
		}
		System.out.println();

	}}

