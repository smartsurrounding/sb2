package smartpro.struts2.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import smartpro.csv.PojoStudent;

public class CsvPrintAction extends ActionSupport implements ModelDriven {

	// have to initialize it
	PojoStudent pojoStudent = new PojoStudent();

	private static final Logger LOGGER = Logger.getLogger(CsvPrintAction.class);

	public String execute() throws Exception {
		LOGGER.info("Running CustomerAction - execute() ... ...");
		return SUCCESS;
	}

	public Object getModel() {
		return pojoStudent;
	}

}