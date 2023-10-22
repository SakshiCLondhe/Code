class Demo{
	int x=8;
	Demo(){
		System.out.println(this);
		}
	Demo (int x){
		System.out.println(this);
	}
	public static void main(String args[]){
		Demo obj=new Demo();
		Demo obj1=new Demo(8);
	}
}


