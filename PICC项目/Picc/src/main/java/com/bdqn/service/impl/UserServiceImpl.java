package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.UserDao;
import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User userLogin(String userCode, String userPwd) {
        return userDao.userLogin(userCode,userPwd);
    }

    @Override
    public int updateUserPwd(String userPwd, String userCode) {
        return userDao.updateUserPwd(userPwd,userCode);
    }

    @Override
    public int userAdd(User user) {
        return userDao.userAdd(user);
    }

    @Override
    public int userUpdate(User user) {
        return userDao.userUpdate(user);
    }

    @Override
    public int userDeleteState(String userCode) {
        return userDao.userDeleteState(userCode);
    }

    @Override
    public User userByCode(String userCode) {
        return userDao.userByCode(userCode);
    }

    @Override
    public User userById(String userCode) {
        return userDao.userById(userCode);
    }

    @Override
    public List<User> userAll(User user) {
        return userDao.userAll(user);
    }
}
