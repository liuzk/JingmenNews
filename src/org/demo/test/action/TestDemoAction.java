package org.demo.test.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

@Results({ @Result(name = "init", location = "/WEB-INF/org/demo/test1/init.jsp"), })
public class TestDemoAction extends ActionSupport {

	private static final long serialVersionUID = 2929084038282919178L;

	@Override
	@Action(value = "excute")
	public String execute() throws Exception {
		String tmp = null;
		// tmp.indexOf(9);
		// tmp.equals("");
		return "init";
	}

	@Action("init")
	public String init() {
		return "init";
	}

}
