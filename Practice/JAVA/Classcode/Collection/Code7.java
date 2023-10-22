import java.util.*;
class Code7 extends ArrayList {
	public static void main(String args []){
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add("Hii");
		obj.add('A');
		System.out.println(obj);

		obj.add(4,'B');
		System.out.println(obj);

	}
}
