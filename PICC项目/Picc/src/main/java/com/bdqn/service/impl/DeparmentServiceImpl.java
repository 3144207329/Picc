package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.DeparmentDao;
import com.bdqn.pojo.Department;
import com.bdqn.service.DeparmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class DeparmentServiceImpl extends BaseServiceImpl implements DeparmentService {
    @Resource
    private DeparmentDao deparmentDao;
    @Override
    public List<Department> departmentAll() {
        return deparmentDao.departmentAll();
    }
}
