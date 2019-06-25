package smartpro.struts2.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import smartpro.struts2.modeldriven.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven {

	// have to initialize it
	Customer customer = new Customer();

	private static final Logger LOGGER = Logger.getLogger(CustomerAction.class);

	public String execute() throws Exception {
		LOGGER.info("Running CustomerAction - execute() ... ...");
		return SUCCESS;
	}

	public Object getModel() {
		return customer;
	}

}