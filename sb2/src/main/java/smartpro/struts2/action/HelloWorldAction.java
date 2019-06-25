package smartpro.struts2.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private String name;
	private String sex;
	private String country;
	
	private static final Logger LOGGER = Logger.getLogger(HelloWorldAction.class);

	public String execute() throws Exception {
		LOGGER.info("Running HelloWorldAction - execute() ... ...");
		return "success";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}