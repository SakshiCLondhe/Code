//Default Exception handling:= gives Error in following format
//1=tread name 
//2=exception name
//3= description(optional)
//4=stack trace
//which method uses default exception handler
//1=Printstacktrace()
//2=toString()
//3=getmsg()
import java.io.*;
class Demo{
	void getData()throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int data; 
		try{

	data= Integer.parseInt(br.readLine());
        System.out.println(data);

		}
		catch(NumberFormatException obj)
		{
			System.out.println("exception");
	}
	}
	public static void main(String args [])throws IOException{
		Demo obj = new Demo();
		obj.getData();
	}
}
