package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.UserDeparmentDao;
import com.bdqn.service.UserDeparmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserDeparmentServiceImpl extends BaseServiceImpl implements UserDeparmentService {
    @Resource
    private UserDeparmentDao userDeparmentDao;
    @Override
    public int userDeparmentAdd(Integer uid,Integer did) {
        return userDeparmentDao.userDeparmentAdd(uid,did);
    }

    @Override
    public int userDeparmentUpdate(Integer uid,Integer did,Integer udid) {
        return userDeparmentDao.userDeparmentUpdate(uid,did,udid);
    }
}
