package com.bdqn.service.impl;

import com.bdqn.common.service.impl.BaseServiceImpl;
import com.bdqn.dao.DesigNatedDao;
import com.bdqn.pojo.DesigNated;
import com.bdqn.service.DesigNateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DesigNateServiceImpl extends BaseServiceImpl implements DesigNateService {
    @Resource
    private DesigNatedDao desigNatedDao ;
    /**
     * 查询全部信息
     * @return List<DesigNated>
     */
    @Override
    public List<DesigNated> ListByDesigNated(DesigNated desigNated) {
        return desigNatedDao.ListByDesigNated(desigNated);
    }
    /**
     * 查询单一数据
     * 参数：id
     * @return DesigNated对象
     *
     */
    @Override
    public DesigNated GetById(DesigNated desigNated) {
        return desigNatedDao.GetById(desigNated);
    }

    @Override
    public int updateBydgId(DesigNated desigNated) {
//        System.err.println(desigNated.getTelephone());
//        System.err.println(desigNated.getCustomerName());
//        System.err.println(desigNated.getLocation());
//        System.err.println(desigNated.getDestination());
//        System.err.println(desigNated.getLicensePlate());
//        System.err.println(desigNated.getClickType());
//        System.err.println(desigNated.getAppointmentTime());
        System.err.println(desigNatedDao.updateBydgId(desigNated));
            return desigNatedDao.updateBydgId(desigNated);



    }

    @Override
    public int insertOne(DesigNated desigNated) {
        return desigNatedDao.insertOne(desigNated) ;
    }

    @Override
    public int insertsubmit(DesigNated desigNated) {
        return desigNatedDao.insertsubmit(desigNated);
    }

    @Override
    public int updateBystate(DesigNated desigNated) {
        return desigNatedDao.updateBystate(desigNated);
    }

    @Override
    public int updateByshenhe(DesigNated desigNated) {
            return desigNatedDao.updateByshenhe(desigNated);

    }
    @Override
    public int updateBybohui(DesigNated desigNated) {
        return desigNatedDao.updateByshenhe(desigNated);

    }

    @Override
    public int updateByslingqu(DesigNated desigNated) {
        return desigNatedDao.updateByslingqu(desigNated);
    }

    @Override
    public int updateBychuli(DesigNated desigNated) {
        return desigNatedDao.updateBychuli(desigNated);
    }

    @Override
    public List<DesigNated> designatedApprovalAll(DesigNated desigNated) {
        return desigNatedDao.designatedApprovalAll(desigNated);
    }

    @Override
    public List<DesigNated> designatedReceiveAll(DesigNated desigNated) {
        return desigNatedDao.designatedReceiveAll(desigNated);
    }
}
