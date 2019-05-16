package com.bdqn.service;

import com.bdqn.dao.UserDeparmentDao;

public interface UserDeparmentService {
    public int userDeparmentAdd(Integer uid,Integer did);
    public int userDeparmentUpdate(Integer uid,Integer did,Integer udid);
}
