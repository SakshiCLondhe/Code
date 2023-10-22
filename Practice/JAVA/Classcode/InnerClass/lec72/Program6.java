/*Annonymous Inner Class*/
class Demo{
	void Marry(){
		System.out.println("Kriti");
	}
}
class Client{
	public static void main(String args []){
	Demo obj = new Demo(){
		void Marry(){
			System.out.println("Disha");
	}};
	obj.Marry();
}
}

