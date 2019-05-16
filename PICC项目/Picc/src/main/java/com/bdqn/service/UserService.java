package com.bdqn.service;

import com.bdqn.pojo.User;

import java.util.List;

public interface UserService {
    //登陆
    public User userLogin(String userCode, String userPwd);
    //修改密码
    public int updateUserPwd(String userPwd,String userCode);

    public int userAdd(User user);

    public int userUpdate(User user);
    public int userDeleteState(String userCode);
    public User userByCode(String userCode);
    public User userById(String userCode);
    public List<User> userAll(User user);
}
