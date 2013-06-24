package cn.com.dao;

import java.util.List;

import cn.com.entity.User;

public interface IUserDao {

	public void save(User user);

	public void delete(int id);

	public void update(User user);

	public List<User> query();

	public User get(int id);

}
