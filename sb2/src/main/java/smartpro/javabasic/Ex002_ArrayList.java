package smartpro.javabasic;

import java.util.ArrayList;

public class Ex002_ArrayList {

	public Ex002_ArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			ArrayList<TestObject> arrayList = new ArrayList<TestObject>(); // ArrayList
			ArrayList<String> arrayList2 = new ArrayList<String>(); // ArrayList (String type)

			TestObject obj1 = new TestObject();
			TestObject obj2 = new TestObject();
			TestObject obj3 = new TestObject();

			obj1.setAge(10);
			obj1.setName("a1");
			obj2.setAge(20);
			obj2.setName("a2");
			obj3.setAge(30);
			obj3.setName("a3");

			arrayList.add(obj1);
			arrayList.add(obj3);
			arrayList.add(obj2);

			for (int i = 0; i < arrayList.size(); i++) {
				TestObject obj = arrayList.get(i);
				System.out.println(obj.getAge());
				System.out.println(obj.getName());
//				System.out.println(arrayList.get(i));
			}
			// System.out.println(str3.hashCode()); //print hashCode of str3

		} catch (Exception e) {
			e.printStackTrace(); // next line
		} finally {
			System.out.println(""); // next line
			System.out.println("End of the Exercise");
		}
	}

}
