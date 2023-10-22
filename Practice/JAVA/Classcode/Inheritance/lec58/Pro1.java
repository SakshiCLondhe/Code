class Player{
	private int jerNo=0;
	private String name =null;
	Player (int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In constructor");
	}
	void info(){
		System.out.println(jerNo+"="+name);
	}
}
class Client{
	        public static void main(String []){
		Player obj1=new Player(18,"Virat");
		Player obj2=new Player(7,"MSD");
		Player obj3=new Player(77,"Shubhman");
	}
}


