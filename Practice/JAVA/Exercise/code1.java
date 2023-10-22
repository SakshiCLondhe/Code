import java.io.*;
class IO{
	public static void main(String args [])throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);

		
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter marks");

		int x=Integer.parseInt(br.readLine());
		int i=Integer.parseInt(br.readLine());
		

		for(i=1;i<=5;i++){
			System.out.println(x);
		}
}
	}
