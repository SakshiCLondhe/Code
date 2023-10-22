class Inner{
	void Game(){
		System.out.println("football");
	}
}
class Client{
	public static void main(String args []){
		Inner obj = new Inner(){
			void Game(){
				System.out.println("badminton");
	}};
		obj.Game();
	}
}

