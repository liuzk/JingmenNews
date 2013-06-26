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

@Repository("baseDao")
public class BaseDao<T extends Serializable> implements IBaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
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
		} finally {
			// spring管理hibernate的sessionfactory事务
			// if (session != null)
			// session.close();
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
		}
		return list;
	}

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

}
