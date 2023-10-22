import java.io.*;
class Index{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for (int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int search = Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++){
			if(arr[i]==search){
				System.out.println("Searched Elements="+i);
			}
		}
	}
}



