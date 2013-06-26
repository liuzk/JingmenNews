package cn.com.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T extends Serializable> {
	public void save(T t);

	public void update(T t);

	public void delete(T t);

	public T get(Serializable id);

	public List<T> findAll(Class<T> T);
}
