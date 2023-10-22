import java.io.*;
class Demo2{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		int arr[]=new int[a];
	        int count1=0;
		int count2=0;
		for(int i=0;i<a;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("even elements= " +count1);
		System.out.println("odd elements ="+count2);
	}
		}


