import java.io.*;
class Code1{
	public static void main(String args [])throws IOException{
		int sum = 0;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			int arr[]= new int [a];
			System.out.println("Enter Elements");
			for (int i=0;i<arr.length;i++){
			    arr[i]= Integer.parseInt(br.readLine());
				if(arr[i]%2==1){
					sum = sum + arr[i];
				}
			}
			System.out.println(sum);
	}
}




