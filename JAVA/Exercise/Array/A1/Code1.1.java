import java.io.*;
class demo{
	public static void main(String args []) throws IOException{
		int sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int size =Integer.parseInt(br.readLine());
				int arr[]= new int [size];
				System.out.println("Enter Elements");
				for(int i=0;i<size;i++){
					arr[i]=Integer.parseInt(br.readLine());
					if(arr[i]%2==0){
						sum=sum+arr[i];
					}
				}
				System.out.println(sum);
	}
}




