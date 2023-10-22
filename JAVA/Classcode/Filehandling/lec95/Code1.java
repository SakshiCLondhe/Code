//creating new File
import java.io.*;
class Code{
	 public static void main(String args [])throws Exception{
		  File f=new File("hello.txt");
		  f.createNewFile();// this method throws
			System.out.println("file is created"); 
	 }
}
