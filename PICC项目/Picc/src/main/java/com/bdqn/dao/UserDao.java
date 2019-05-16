package com.bdqn.dao;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //登陆
    public User userLogin(@Param("userCode")String userCode,@Param("userPwd")String userPwd);
    //修改密码
    public int updateUserPwd(@Param("userPwd")String userPwd,@Param("userCode")String userCode);

    public int userAdd(User user);

    public int userUpdate(User user);
    public int userDeleteState(@Param("userCode")String userCode);
    public User userById(@Param("userCode")String userCode);
    public User userByCode(@Param("userCode")String userCode);
    public List<User> userAll(User user);
}
