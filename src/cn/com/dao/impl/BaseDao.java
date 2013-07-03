package cn.com.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.dao.IBaseDao;

@Repository
public class BaseDao<T extends Serializable> implements IBaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz) {
		Session session = getSession();
		List<T> list = new ArrayList<T>();
		try {
			// 开启事务
			// session.beginTransaction();
			list = session.createQuery(" from " + clazz.getName()).list();
			// 提交事务
			// session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null)
				session.getTransaction().rollback();
			return null;
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<T> createQuery(Class<T> clazz, String hql) {
		Session session = getSession();
		List<T> list = new ArrayList<T>();
		try {
			list = session.createQuery(" from " + clazz.getName() + " " + hql)
					.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null)
				session.getTransaction().rollback();
			return null;
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<T> createQuery(Class<T> clazz, String hql, Integer pageNum,
			Integer pageSize) {
		Session session = getSession();
		List<T> list = new ArrayList<T>();
		try {
			list = session.createQuery(" from " + clazz.getName() + " " + hql)
					.setFirstResult(pageNum * pageSize).setMaxResults(pageSize)
					.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null)
				session.getTransaction().rollback();
			return null;
		}
		return list;
	}

	// public void save(T t) {
	//
	// }
	//
	// public void update(T t) {
	//
	// }
	//
	// public void delete(T t) {
	//
	// }
	//
	// public T get(Serializable id) {
	// return null;
	// }

}
