package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.NewCarDao;
import com.bdqn.pojo.NewCar;
import com.bdqn.service.NewCarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class NewCarServiceImpl extends BaseServiceImpl implements NewCarService {
    @Resource
    private NewCarDao newCarDao;


    @Override
    public List<NewCar> newCarAll(NewCar newCar) {
        return newCarDao.newCarAll(newCar);
    }

    @Override
    public int newCarUpdate(NewCar newCar) {
        return newCarDao.newCarUpdate(newCar);
    }

    @Override
    public int newCarAdd(NewCar newCar) {
        return newCarDao.newCarAdd(newCar);
    }

    @Override
    public int newCarDelete(Integer ncId) {
        return newCarDao.newCarDelete(ncId);
    }

    @Override
    public NewCar newCarById(Integer ncId) {
        return newCarDao.newCarById(ncId);
    }

    @Override
    public List<NewCar> newCarCaoGao(NewCar newCar) {
        return newCarDao.newCarCaoGao(newCar);
    }

    @Override
    public int newCarCaoGaoCount() {
        return newCarDao.newCarCaoGaoCount();
    }

    @Override
    public List<NewCar> newCarBoHuiAll(NewCar newCar) {
        return newCarDao.newCarBoHuiAll(newCar);
    }

    @Override
    public int newCarBoHuiCount() {
        return newCarDao.newCarBoHuiCount();
    }

    @Override
    public List<NewCar> newCarApprovalAll(NewCar newCar) {
        return newCarDao.newCarApprovalAll(newCar);
    }

    @Override
    public int newCarApproval(Integer ncId) {
        return newCarDao.newCarApproval(ncId);
    }

    @Override
    public int newCarReject(Integer ncId, String rejectInformation) {
        return newCarDao.newCarReject(ncId,rejectInformation);
    }

    @Override
    public List<NewCar> yesNewCarReceive(NewCar newCar) {
        return newCarDao.yesNewCarReceive(newCar);
    }

    @Override
    public List<NewCar> noNewCarReceive(NewCar newCar) {
        return newCarDao.noNewCarReceive(newCar);
    }

    @Override
    public int newCarReceiveUpdate(Integer ncId) {
        return newCarDao.newCarReceiveUpdate(ncId);
    }

    @Override
    public int newCarHandleUpdate(Integer ncId) {
        return newCarDao.newCarHandleUpdate(ncId);
    }

    @Override
    public int newCarReceiveCount() {
        return newCarDao.newCarReceiveCount();
    }

    @Override
    public int newCarAbnormalUpdate(Integer ncId) {
        return newCarDao.newCarAbnormalUpdate(ncId);
    }

    @Override
    public int newCarAbnormalCount() {
        return newCarDao.newCarAbnormalCount();
    }

    @Override
    public List<NewCar> newCarAbnormal(NewCar newCar) {
        return newCarDao.newCarAbnormal(newCar);
    }
}
