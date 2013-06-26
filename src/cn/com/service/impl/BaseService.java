package cn.com.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.dao.impl.BaseDao;
import cn.com.service.IBaseService;

public class BaseService<T extends Serializable> implements IBaseService<T> {

	// public BaseDao<T> getBaseDao() {
	// return baseDao;
	// }

	@Autowired
	private BaseDao<T> baseDao;

	// @Override
	// public void save(T t) {
	// baseDao.save(t);
	// }
	//
	// @Override
	// public void update(T t) {
	// baseDao.update(t);
	// }
	//
	// @Override
	// public void delete(T t) {
	// baseDao.delete(t);
	// }
	//
	// @Override
	// public T findById(Class<T> clazz, int id) {
	// return baseDao.findById(clazz, id);
	// }

	public List<T> findAll(Class<T> clazz) {
		return baseDao.findAll(clazz);
	}

	public List<T> createQuery(Class<T> clazz, String hql) {
		return baseDao.createQuery(clazz, hql);
	}

	public List<T> createQuery(Class<T> clazz, String hql, Integer pageNum,
			Integer pageSize) {
		return baseDao.createQuery(clazz, hql, pageNum, pageSize);
	}

}
