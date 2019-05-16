package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.MenuDao;
import com.bdqn.pojo.Menu;
import com.bdqn.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl extends BaseServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;
    @Override
    public List<Menu> shu(Integer rid) {
        return menuDao.shu(rid);
    }

    @Override
    public List<Menu> zi(Integer rid,Integer pid) {
        return menuDao.zi(rid,pid);
    }


}
