class Company{
        protected int EmpId=180;
		String EmpName="Sakshi";
		static String Company="Google";
                static void Location(){
			String str = "pune";
		}
		void salary(){
			System.out.println("it's confidential info");
		}
	}

class Emp{
	public static void main(String args []){
          Company obj = new Company();
	  System.out.println("id=" + obj.EmpId);
	  System.out.println("name="+ obj.EmpName);
	  System.out.println("Company="+ Company);
	  System.out.println( "Location"+ Location);
          System.out.println("salary="+ obj.salary);
	}
	}

