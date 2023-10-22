import java.io.*;
class P4{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int min=arr[0];
		for(int i=0;i<size;i++){
			if (arr[i]<min){
				min = arr[i];
			}
		}
				System.out.println("minimum elemnts"+min);
			}
		
	}
