import java.io.*;
class Pro8{
	public static  void main (String  []a)throws IOException{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			 int size1 = Integer.parseInt(br.readLine());
			 int size2=Integer.parseInt(br.readLine());

			int arr1[]=new int [size1];
			int arr2[]=new int [size2];
			int arr3[]=new int [size1 + size2];
			System.out.println(" first array elements"); 

			for (int i=0;i<arr1.length;i++){
				arr1[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Second array elemnts");
			for(int i=0;i<arr2.length;i++){
				arr2[i]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i<arr1.length;i++){
				arr3[i]=arr1[i];
			}
			for(int i=0;i<arr2.length;i++){
				arr3[size1+i]=arr2[i];
			}
			System.out.println("mergedArray");
                          for(int i=0;i<arr3.length;i++){

			System.out.println(arr3[i]);
	}}
}
			
			



