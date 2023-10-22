//BufferReader Closed
import java.io.*;
class Demo4{
	public static void main(String a[])throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		br.close();
		char ch=(char) isr.read();
                System.out.println("char="+ch);
	}
}
