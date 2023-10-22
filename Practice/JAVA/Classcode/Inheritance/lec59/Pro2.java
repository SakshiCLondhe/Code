//creating one Child class object calling multiple methods(Constructor)
class Parent{
	Parent(){
	
		System.out.println("in parent");
	}
}
class Child extends Parent{
	Child(){
	        System.out.println("in child");
	
		}
	}
class Client{
	public static void main(String args []){
	//Three types of Crating object of child class
	//Parent obj=new Parent();//parent class refernce parent class object
      Child obj = new Child();//Child class refernce child class object
	//Parent obj= new Child();//Parent class refernce child class object

	
	
	}
}


