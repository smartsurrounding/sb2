package smartpro.csv;

import java.util.Objects;

public class Hihi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// These two have the same value
		System.out.println(new String("test").equals("test")); // --> true 

		// ... but they are not the same object
		System.out.println(new String("test") == "test"); // --> false 

		// ... neither are these
				System.out.println(new String("test") == new String("test")); // --> false 

		// ... but these are because literals are interned by 
		// the compiler and thus refer to the same object
						System.out.println("test" == "test"); // --> true 

		// ... string literals are concatenated by the compiler
		// and the results are interned.
								System.out.println("test" == "te" + "st"); // --> true

		// ... but you should really just call Objects.equals()
		System.out.println(Objects.equals("test", new String("test"))); // --> true
				System.out.println(Objects.equals(null, "test") );// --> false
						System.out.println(Objects.equals(null, null)); // --> true
	}

}
