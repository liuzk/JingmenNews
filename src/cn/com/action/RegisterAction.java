package cn.com.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.entity.User;
import cn.com.service.impl.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@Controller
@Scope("prototype")
@ParentPackage(value = "default-package")
@Results( { @Result(name = "success", location = "/success.jsp"),
		@Result(name = "input", location = "/register.jsp") })
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 6095344233772050061L;

	@Resource(name = "userService")
	private UserService userService;

	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setUsername(getUsername());
		user.setPassword(getPassword());
		userService.save(user);
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	@RequiredStringValidator(message = "请输入用户名!")
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	@RequiredStringValidator(message = "请输入密码!")
	public void setPassword(String password) {
		this.password = password;
	}

}
