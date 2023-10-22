import java.io.*;
class Pro7{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of first array");
		int a= Integer.parseInt(br.readLine());
		System.out.println("enter size of second elements");
		int b =Integer.parseInt(br.readLine());
		int arr1[]=new int [a];
		int arr2[]=new int[b];
		System.out.println("eneter elements of first array");
		for(int i=0;i<a;i++){

			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter elements  of second array");
		for(int i=0;i<b;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				if(arr1[i]!=arr2[j]){
				System.out.println("Uncommom elements=" +arr1[i]);
				break;
			}
		}
	}
}
						
}

