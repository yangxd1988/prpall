package com.prpall.model;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

	@Select("select * from user where username=#{username}")
	public User selectUser(String username);

	@Insert("insert into t_user(name, age) values(#{name}, #{age})")
	public void insertUser(User user);

	@Update("update t_user set name=#{name}, age=#{age} where id=#{id}")
	public void updateUser(User user);

	@Select("select * from t_user where id=#{id}")
	public User findById(int id);

	@Delete("delete from t_user where id=#{id}")
	public void deleteUser(int id);

}