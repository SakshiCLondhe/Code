class Core2Web{
	String NameOfStudent ="Sakshi";
        static	String CourseName ="JavaDsa";
	int RankOfStudent =50;
	void StudentInfo(){
            System.out.println("Name="+NameOfStudent);
	    System.out.println("CourseName="+CourseName);
	    System.out.println("Rankof student out of  750="+RankOfStudent);
	}
}
class User{
	public static void main(String args []){
		Core2Web obj1=new Core2Web();
		Core2Web obj2=new Core2Web();
		obj1.StudentInfo();
		obj2.StudentInfo();
		
                obj2.NameOfStudent ="Sam";
		obj2.CourseName="Cpp";
		obj2.RankOfStudent=300;
		System.out.println("................");
		obj1.StudentInfo();
		obj2.StudentInfo();
	}
}

