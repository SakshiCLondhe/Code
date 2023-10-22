class Employee{
	int EmpId=10;
	String str ="Sakshi";
	void EmpInfo(){
		System.out.println("Id="+EmpId);
		System.out.println("Name="+str);
	}
}
class MainDemo{
	public static void main(String [] args){
		Employee Emp1 =new Employee();
		Emp1.EmpInfo();
		System.out.println(Emp1.EmpId);
		System.out.println(Emp1.str);
	}
}


