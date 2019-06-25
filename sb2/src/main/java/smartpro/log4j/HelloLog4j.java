package smartpro.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLog4j {
	private static Logger logger = LogManager.getLogger("HelloLog4j");

	public static void main(String[] args) {
		try {
			MyApplication myApplication = new MyApplication();

			// logger.entry();
			logger.info("Hello, World!");
			myApplication.doIt();
			logger.error("Hello, World!");
			// logger.exit();

		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}