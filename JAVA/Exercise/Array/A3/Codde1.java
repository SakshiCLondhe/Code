import java .io.*;
class Code1{
	public static void main(String a [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int [3];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
			
		for(int i=0;i<arr.length;i++){
			int count=0;
		     int temp=arr[i];
			while(temp!=0){
				count++;
				temp=temp/10;

			}
			System.out.println("count of each digit ="+count );
		}
	}
}

			
                    


