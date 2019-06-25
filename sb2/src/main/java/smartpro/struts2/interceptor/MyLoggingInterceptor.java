package smartpro.struts2.interceptor;

import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyLoggingInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	/* Log4j */
	private static final Logger LOGGER = Logger.getLogger(MyLoggingInterceptor.class);

	public String intercept(ActionInvocation invocation) throws Exception {
		/* before invoke */
		String className = invocation.getAction().getClass().getName();
		long startTimeMs = System.currentTimeMillis();
		LOGGER.debug("Before calling action: " + className);

		String result = invocation.invoke();

		/* after invoke */
		long endTimeMs = System.currentTimeMillis();
		LOGGER.info("After calling action: " + className);
		LOGGER.info("Time taken: " + (endTimeMs - startTimeMs) + " ms");

		return result;
	}

	public void destroy() {
		LOGGER.info("Destroying MyLoggingInterceptor ... ...");
	}

	public void init() {
		LOGGER.info("Initializing MyLoggingInterceptor ... ...");
	}
}