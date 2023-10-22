import java.io.*;
class  Pro6{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1[]=new int[5];
		int arr[]=new int[6];
		System.out.println("first elements of first array=");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("second elements of second array=");

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
                for(int i=0;i<arr1.length;i++){
		   for(int j=0;j<arr.length;j++){

			if(arr1[i]==arr[j]){
				System.out.println("common elements= " +arr[j]);
				break;
			}
		   }
		}
	}
}

