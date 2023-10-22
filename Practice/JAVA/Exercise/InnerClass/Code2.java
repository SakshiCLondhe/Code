// Real Time Eg
import java.util.*;
class PhonePay{
	 void OpenAPP(){
		 System.out.println(" welcome to phone pay");
	 class BankStatement{

		 void Transaction_failed(){
			 System.out.println("Server busy");

			}
		  void Transaction_Succesful(){
			  System.out.println(" payment Succesful");
		  }
	 }
	 BankStatement obj1= new BankStatement();
	 obj1.Transaction_failed();
	 obj1.Transaction_Succesful();
	 }void AccountBalance(){
		 System.out.println("Balance Sufficient");
	 }
}
class Client{
	 public static void main(String args []){
		 PhonePay obj = new PhonePay();
		 obj.OpenAPP();
		 obj.AccountBalance();
	 }
}
	 

