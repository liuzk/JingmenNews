package cn.com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.dao.BaseHibernateDao;
import cn.com.dao.IUserDao;
import cn.com.entity.User;

// ��������Ϊ���ݳ־ò����
@Repository("userDao")
public class UserDao extends BaseHibernateDao implements IUserDao {

	public void save(User user) {
		getSession().save(user);
	}

	public void delete(int id) {
		getSession().delete(getSession().load(User.class, id));
	}

	public void update(User user) {
		getSession().update(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> query() {
		return getSession().createQuery("from User").list();
	}

	public User get(int id) {
		return (User) getSession().get("from User", id);
	}

}
