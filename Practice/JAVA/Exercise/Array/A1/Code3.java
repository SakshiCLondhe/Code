import java.io.*;
class IndexPro{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int prod=1;
		int arr[]= new int [size];
		for (int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1){
			prod=prod*i;
			}
		}
		System.out.println(prod);
	}
}


