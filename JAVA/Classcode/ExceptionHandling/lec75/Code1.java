import java.io.*;
class Code{
	public static void main(String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
		br.close(); //runtime exception = stream closed Ioexception
		String str1=br.readLine();
		System.out.println(str1);
	}
}
	
