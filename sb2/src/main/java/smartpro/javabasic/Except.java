package smartpro.javabasic;

public class Except {
	int id = 0;
	int arr[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) throws Exception {
		try {
			Except e = null;
			System.out.println(e.id);
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("e: " + e);
			System.out.println("printStackTrace: ");
			e.printStackTrace();
//			throw new Exception();
		}

		try {
			Except e = new Except();
			System.out.println(e.arr[6]);
		} catch (Exception e) {
			System.out.println("Message: " + e.getMessage());
			System.out.println("e: " + e);
			System.out.println("printStackTrace: ");
			e.printStackTrace();
//			throw new Exception();
		}
	}

}
