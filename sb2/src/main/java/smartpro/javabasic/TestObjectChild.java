package smartpro.javabasic;

public class TestObjectChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//singleton, only one instance in a life cycle,
		
		TestObject obj1 = new TestObject();
		TestObject obj2 = new TestObject();

		obj1.setAge(10);
		obj2.setAge(20);
		
		System.out.println(obj1.getAge());
		System.out.println(obj2.getAge());
		
		System.out.println(TestObject.isSexMale());
	}

}
