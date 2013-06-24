package cn.com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseHibernateDao {

	// @Resource(name = "sessionFactory")
	// // Ϊ����HibernateDaoSupportע��sessionFactory��ֵ
	// public void setSuperSessionFactory(SessionFactory sessionFactory) {
	// super.setSessionFactory(sessionFactory);
	// }
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}