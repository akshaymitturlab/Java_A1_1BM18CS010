import java.util.*;

class Gen<Type1, Type2> {
	Type1 ob1;
	Type2 ob2;
	
	void setData(Type1 var1, Type2 var2) {
		ob1 = var1;
		ob2 = var2;
	}
	
	void getData() {
	System.out.println(ob1 + " " + ob2);
	}
}


class GenericsDemo{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		Gen<String, Integer> test = new Gen<String, Integer>();
		test.setData(name, age);
		test.getData();
	}
}
