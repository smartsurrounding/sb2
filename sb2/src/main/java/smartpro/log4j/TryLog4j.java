package smartpro.log4j;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class TryLog4j extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(TryLog4j.class);

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.opensymphony.xwork2.Action
	 */
	public String execute() {
		LOGGER.debug("Hello debug TryLog4j!");
		LOGGER.info("Hello info TryLog4j!");
		LOGGER.warn("Hello warn TryLog4j!");
		LOGGER.fatal("Hello fatal TryLog4j!");
		LOGGER.error("Hello error TryLog4j!");

		return SUCCESS;
	}
}