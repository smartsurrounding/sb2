package smartpro.javabasic;

public class CompilerSugar {

	public static void main(String[] args) {
		try {
			Integer i1 = 100;
			Integer i2 = 100;
			if (i1.equals(i2)) {
				System.out.println("i1.equals(i2)");
			} else {
				System.out.println("!i1.equals(i2)");
			}
			if (i1 == i2) {
				System.out.println("i1 == i2");
			} else {
				System.out.println("i1 != i2");
			}
		} catch (Exception e) {

		}

		try {
			Integer i1 = 200;
			Integer i2 = 200;
			if (i1.equals(i2)) {
				System.out.println("i1.equals(i2)");
			} else {
				System.out.println("!i1.equals(i2)");
			}
			if (i1 == i2) {
				System.out.println("i1 == i2");
			} else {
				System.out.println("i1 != i2");
			}
		} catch (Exception e) {

		}
/*		
 *		IntegerCache.low	default: -128
 *		IntegerCache.high	default: 127
 *
		public static Integer valueOf(int i) {
		    assert IntegerCache.high >= 127;
		    if (i >= IntegerCache.low && i <= IntegerCache.high)
		        return IntegerCache.cache[i + (-IntegerCache.low)];
		    return new Integer(i);
		}
*/
	}

}
