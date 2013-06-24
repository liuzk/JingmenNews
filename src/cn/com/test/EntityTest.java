package cn.com.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import cn.com.entity.User;

public class EntityTest {

	private Session session;

	@Before
	public void initSession() {
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	@Test
	// ��������û�
	public void testSave() {
		session.beginTransaction();
		User user = new User();
		user.setUsername("rongxh7");
		user.setPassword("blogjava");
		session.save(user);
		session.getTransaction().commit();
	}

	@Test
	// ���Բ�ѯ�û��б�
	@SuppressWarnings("unchecked")
	public void testQuery() {
		session.beginTransaction();
		Query query = session.createQuery("from User u");
		List<User> users = query.list();
		for (Iterator<User> it = users.iterator(); it.hasNext();) {
			User user = it.next();
			System.out.println("username = " + user.getUsername());
		}
		session.getTransaction().commit();
	}
//
//	@Test
//	// ���Բ�ѯ�����û�
//	public void testGet() {
//		session.beginTransaction();
//		User user = (User) session.get(User.class, 1);
//		System.out.println("username = " + user.getUsername());
//		session.getTransaction().commit();
//	}
//
//	@Test
//	// ���Բ�ѯ�޸��û�
//	public void testUpdate() {
//		session.beginTransaction();
//		User user = (User) session.load(User.class, 1);
//		user.setPassword("hello blogjava");
//		session.update(user);
//		session.getTransaction().commit();
//	}
//
//	@Test
//	// ����ɾ���û�
//	public void testDelete() {
//		session.beginTransaction();
//		session.delete(session.load(User.class, 1));
//		session.getTransaction().commit();
//	}

}
