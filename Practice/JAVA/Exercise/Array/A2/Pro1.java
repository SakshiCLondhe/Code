import java.io.*; 
class Demo{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int arr[]=new int [10];
		int sum =0;
		for (int i=0;i<10;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<10;i++){
			sum = sum+arr[i];}

		System.out.println("sum of elements in array=" +sum);
	}}




