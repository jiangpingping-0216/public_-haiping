package org.example.test.dao;

import org.example.test.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询指定的用户
     * @param user
     * @return
     */
    public Integer querySpecificUser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int insertUser(User user);

    /**
     * 查询所有的用户
     * @return
     */
    public List<User> query();
}
