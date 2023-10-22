//continue
class Code3{
	public static void main(String args []){
		int x=50;
		for (int i=1;i<=x;i++){
			if ((i%3==0&&i%5==0)||(i%4==0)){
				continue;
			}
			System.out.println(i);
		}
	}
}
