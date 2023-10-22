//String Tokenizer(class)
import java.util.*;
import java.io.*;
class StringTokenDemo{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter name,rollno,div");
		String Sinfo =br.readLine();
		StringTokenizer St=new StringTokenizer(Sinfo," ");
		String Token1=St.nextToken();
		String Token2=St.nextToken();
		String Token3=St.nextToken();
		System.out.println("name"+Token1);
		System.out.println("rollno"+Token2);
		System.out.println("div"+Token3);
             }
}

