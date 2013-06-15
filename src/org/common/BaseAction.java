package org.common;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, ServletContextAware {

	private static final long serialVersionUID = -257029206382810284L;
	public HttpServletRequest request;
	public HttpServletResponse response;
	public ServletContext ctx;

	@Override
	public void setServletContext(ServletContext arg0) {
		this.ctx = arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public ServletContext getCtx() {
		return ctx;
	}

	public void setCtx(ServletContext ctx) {
		this.ctx = ctx;
	}

}
