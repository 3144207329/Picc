package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.SubstitutevehicleDao;
import com.bdqn.pojo.Substitutevehicle;
import com.bdqn.service.SubstitutevehicleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SubstitutevehicleServiceImpl extends BaseServiceImpl implements SubstitutevehicleService {

    //自动装配
    @Resource
    private SubstitutevehicleDao jiancheDao;

    //代检车查询所有
    @Override
    public List<Substitutevehicle> SubstitutevehicleAll(Substitutevehicle jianche) {
        return jiancheDao.SubstitutevehicleAll(jianche);
    }
    //根据id查询
    @Override
    public Substitutevehicle jiancheById(Integer msId) {
        return jiancheDao.jiancheById(msId);
    }
    //审批
    @Override
    public int approval(Integer msId) {
        return jiancheDao.approval(msId);
    }
    //驳回
    @Override
    public int jianchereject(Integer msId, String rejectInformation) {
        return jiancheDao.jianchereject(msId,rejectInformation);
    }

    //查询所有已提交和未驳回的所有信息
    @Override
    public List<Substitutevehicle> jianapprovalAll(Substitutevehicle jianche) {
        return jiancheDao.jianapprovalAll(jianche);
    }

    //修改
    @Override
    public int jiancheUpdate(Substitutevehicle jianche) {
        return jiancheDao.jiancheUpdate(jianche);
    }

    //增加
    @Override
    public int jiancheAdd(Substitutevehicle jianche) {
        return jiancheDao.jiancheAdd(jianche);
    }

    @Override
    public int jiancheDelete(Integer msId) {
        return jiancheDao.jiancheDelete(msId);
    }

    @Override
    public List<Substitutevehicle> jiancheCarReceive(Substitutevehicle jiancheCar) {
        return jiancheDao.jiancheCarReceive(jiancheCar);
    }

    @Override
    public int jiancheCarUpdate(Integer msId) {
        return jiancheDao.jiancheCarUpdate(msId);
    }

    @Override
    public int jiancheCarAbnormalCount() {
        return jiancheDao.jiancheCarAbnormalCount();
    }

    @Override
    public int jiancheCarAbnormalUpdate(Integer msId) {
        return jiancheDao.jiancheCarAbnormalUpdate(msId);
    }

    @Override
    public List<Substitutevehicle> jiancheCarAbnormal(Substitutevehicle newCar) {
        return jiancheDao.jiancheCarAbnormal(newCar);
    }

    @Override
    public List<Substitutevehicle> jianchecaogaoAll(Substitutevehicle caogao) {
        return jiancheDao.jianchecaogaoAll(caogao);
    }

    @Override
    public int jianchebhCount() {
        return jiancheDao.jianchebhCount();
    }

    @Override
    public int jianchecaoGaoCount() {
        return jiancheDao.jianchecaoGaoCount();
}

    @Override
    public List<Substitutevehicle> jianchebhAll(Substitutevehicle mishu) {
        return jiancheDao.jianchebhAll(mishu);
    }
}
