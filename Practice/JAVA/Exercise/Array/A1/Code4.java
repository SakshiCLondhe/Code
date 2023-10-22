import java.util.*;
class Char{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
			if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u'){
				System.out.print(arr[i]+" ");
			}
		}
			System.out.println();
	}
}



