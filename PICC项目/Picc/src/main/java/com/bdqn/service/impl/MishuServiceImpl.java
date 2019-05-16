package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.MishuDao;
import com.bdqn.pojo.Mishu;
import com.bdqn.service.MishuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MishuServiceImpl extends BaseServiceImpl implements MishuService {
    @Resource
    private MishuDao mishuDao;


    @Override
    public List<Mishu> mishuAll(Mishu mishu) {
        return mishuDao.mishuAll(mishu);
    }

    @Override
    public int mishuUpdate(Mishu mishu) {
        return mishuDao.mishuUpdate(mishu);
    }

    @Override
    public int mishuAdd(Mishu mishu) {
        return mishuDao.mishuAdd(mishu);
    }

    @Override
    public int mishuDelete(Integer msId) {
        return mishuDao.mishuDelete(msId);
    }

    @Override
    public Mishu mishuById(Integer msId) {
        return mishuDao.mishuById(msId);
    }

    @Override
    public List<Mishu> caoGaoAll(Mishu mishu) {
        return mishuDao.caoGaoAll(mishu);
    }

    @Override
    public int caoGaoCount() {
        return mishuDao.caoGaoCount();
    }

    @Override
    public List<Mishu> boHuiAll(Mishu mishu) {
        return mishuDao.boHuiAll(mishu);
    }

    @Override
    public int boHuiCount() {
        return mishuDao.boHuiCount();
    }

    @Override
    public List<Mishu> approvalAll(Mishu mishu) {
        return mishuDao.approvalAll(mishu);
    }

    @Override
    public int approval(Integer msId) {
        return mishuDao.approval(msId);
    }

    @Override
    public int reject(Integer msId, String rejectInformation) {
        return mishuDao.reject(msId,rejectInformation);
    }
}
