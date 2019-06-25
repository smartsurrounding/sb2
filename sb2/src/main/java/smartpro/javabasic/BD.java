package smartpro.javabasic;

import java.math.BigDecimal;

public class BD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculate with Double:\t\t" + calByDouble());
		System.out.println("Calculate with Big Decimal:\t" + calByBD());
	}

	public static double calByDouble() {
		double i = (double) 1.0;
		double j = (double) 0.8;
		return i - j;
	}

	public static BigDecimal calByBD() {
		BigDecimal i = new BigDecimal("1.0");
		BigDecimal j = new BigDecimal("0.8");
		return i.subtract(j);
	}

}
