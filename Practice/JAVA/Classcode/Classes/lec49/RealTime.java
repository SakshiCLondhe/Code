class Core2Web{
	int NumofStudents=700;
	String Courses ="Java";
	void activity(){
		String s1="classcode";
		String s2="Assignment";
		String s3="Quiz";
		System.out.println(NumofStudents);
		System.out.println(Courses);
	}
}
class C2W{
	public static void main(String args []){
	Core2Web obj=new Core2Web();
	obj.activity();
	}
}
