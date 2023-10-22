import java.io.*;
class max{
	public static void main(String args [])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max= arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

				System.out.println("Max elements in array=" +max);
	}
}	

