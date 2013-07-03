package cn.com.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T extends Serializable> {

	public List<T> findAll(Class<T> T);

	public List<T> createQuery(Class<T> T, String hql);

	public List<T> createQuery(Class<T> T, String hql, Integer pageNum,
			Integer pageSize);
}
