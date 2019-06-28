package smartpro.javabasic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BD {

	public static void main(String[] args) {
		//show difference between double and BigDecimal
		System.out.println("Calculate with Double:\t\t" + calByDouble());
		System.out.println("Calculate with Big Decimal:\t" + calByBD());
		
		//show Scale and RoundingMode in BigDecimal divide()
		BigDecimal a, b;
		int scale = 1;
		
		a = new BigDecimal("1.0");
		b = new BigDecimal("0.8");
		divideRouning(a, b, scale);
		
		a = new BigDecimal("1");
		b = new BigDecimal("4");
		divideRouning(a, b, scale);
		
		a = new BigDecimal("7.1");
		b = new BigDecimal("2");
		divideRouning(a, b, scale);
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

	public static BigDecimal divide(BigDecimal a, BigDecimal b, int scale) {;
		return a.divide(b, scale);
	}

	public static BigDecimal divide(BigDecimal a, BigDecimal b, int scale, RoundingMode roundingMode) {;
		return a.divide(b, scale, roundingMode);
	}

	public static void divideRouning(BigDecimal a, BigDecimal b, int scale) {
		System.out.println("====================================================");
		System.out.println(a + " / " + b + ":\t");
		System.out.println("No RoundingMode:\t" + divide(a, b, scale));
		System.out.println("RoundingMode.HALF_UP:\t" + divide(a, b, scale, RoundingMode.HALF_UP));		//>= 0.5, =1
		System.out.println("RoundingMode.HALF_DOWN:\t" + divide(a, b, scale, RoundingMode.HALF_DOWN));	//>0.5, =1
		System.out.println("RoundingMode.HALF_EVEN:\t" + divide(a, b, scale, RoundingMode.HALF_EVEN));	//1.5, 1 is odd, Half up; 2.5, 2 is even, Half down
	}

}
