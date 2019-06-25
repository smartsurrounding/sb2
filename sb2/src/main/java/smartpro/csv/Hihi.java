package smartpro.csv;

public class Hihi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PojoStudent pojoStudent1 = new PojoStudent(); 
		PojoStudent pojoStudent2 = new PojoStudent(); 
		PojoStudent pojoStudent3 = new PojoStudent(); 

		pojoStudent1.setAge(10);
		pojoStudent2.setAge(20);

		System.out.println(pojoStudent1.getAge());
		System.out.println(pojoStudent2.getAge());

		String str1 = new String("1234a");
		String str2 = new String("1234a");
		
		if(str1 == str2) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
//		if("1234a" == new String("1234a")) {
//			System.out.println("Y");
//		}else {
//			System.out.println("N");
//		}
//		
//		if(str1.equals("1234a")) {
//			System.out.println("Y");
//		}else {
//			System.out.println("N");
//		}
		
	}

}
