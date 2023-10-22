/* Annonymouse Inner Class*/
class Demo{
	void marry(){
		System.out.println("in marry");
	}
}
class Client{
	public static void main(String args []){
		Demo obj = new Demo(){
			void marry(){
				System.out.println("in marry2");
			}
			};
	obj.marry();
	}
}

