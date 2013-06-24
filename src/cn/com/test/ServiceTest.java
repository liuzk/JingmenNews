package cn.com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.entity.User;
import cn.com.service.IUserService;

public class ServiceTest extends AbstractServiceTests {

	@Autowired
	private IUserService userService;

	@Override
	String[] getOtherConfigs() {
		return new String[] { applicationContextFile };
	}

	@Test
	// ≤‚ ‘ÃÌº””√ªß
	public void testSave() {
		User user = new User();
		user.setUsername("rongxh7");
		user.setPassword("blogjava");
		userService.save(user);
	}

}
