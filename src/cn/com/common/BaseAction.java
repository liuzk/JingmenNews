package cn.com.common;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, ServletContextAware {
	private static final long serialVersionUID = -5953879391445987609L;
	private UUIDGenerator uuidGenerator;

	public HttpServletRequest request;
	public HttpServletResponse response;
	public ServletContext ctx;

	public UUIDGenerator getUuidGenerator() {
		return uuidGenerator;
	}

	public void setUuidGenerator(UUIDGenerator uuidGenerator) {
		this.uuidGenerator = uuidGenerator;
	}

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

}
