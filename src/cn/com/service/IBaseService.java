package cn.com.service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T extends Serializable> {
	// public void save(T t);
	//
	// public void update(T t);
	//
	// public void delete(T t);
	//
	// public T findById(Class<T> clazz, int id);

	public List<T> findAll(Class<T> clazz);

	public List<T> createQuery(Class<T> clazz,String hql);
}
