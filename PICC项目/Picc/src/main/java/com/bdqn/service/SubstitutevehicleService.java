package com.bdqn.service;

import com.bdqn.pojo.Substitutevehicle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubstitutevehicleService {
    //查询代检车所有
    public List<Substitutevehicle> SubstitutevehicleAll(Substitutevehicle jianche);

    //根据id查询
    public Substitutevehicle jiancheById(Integer msId);

    //审批
    public int approval(Integer msId);

    //驳回
    public int jianchereject(Integer msId, String rejectInformation);

    //查询已提交和未驳回的所有信息
    public List<Substitutevehicle> jianapprovalAll(Substitutevehicle jianche);

    //修改
    public int jiancheUpdate(Substitutevehicle jianche);

    //增加
    public int jiancheAdd(Substitutevehicle jianche);

      //注销
    public int jiancheDelete(@Param("msId") Integer msId);

    //查询已审批已提交的信息
    public List<Substitutevehicle> jiancheCarReceive(Substitutevehicle jiancheCar);

    //处理
    public int jiancheCarUpdate(Integer msId);

    //查询异常的影响行数
    public int jiancheCarAbnormalCount();

    //点击异常
    public int jiancheCarAbnormalUpdate(@Param("msId") Integer msId);

    //查询异常信息
    public List<Substitutevehicle> jiancheCarAbnormal(Substitutevehicle newCar);

    //草稿箱
    public List<Substitutevehicle> jianchecaogaoAll(Substitutevehicle caogao);

    //驳回行数
    public int jianchebhCount();

    //草稿行数
    public int jianchecaoGaoCount();

    //驳回查询所有
    public List<Substitutevehicle> jianchebhAll(Substitutevehicle mishu);
}
