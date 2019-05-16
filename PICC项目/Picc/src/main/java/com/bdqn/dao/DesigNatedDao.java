package com.bdqn.dao;

import com.bdqn.pojo.DesigNated;

import java.util.List;

public interface DesigNatedDao {
    /**
     * 查询全部信息
     * @return List<DesigNated>
     */
    public List<DesigNated> ListByDesigNated(DesigNated desigNated);
    /**
     * 查询单一数据
     * 参数：id
     * @return DesigNated对象
     */
    public DesigNated GetById(DesigNated desigNated);
    /**
     * 修改数据
     * 参数：DesigNated对象
     * @return int
     */
    public int updateBydgId(DesigNated desigNated);
    /**
     * 增加数据
     * 参数：DesigNated对象
     * @return int
     */
    public int insertOne(DesigNated desigNated);

    /**
     * 增加提交数据
     * 参数：DesigNated对象
     * @return int
     */
    public int insertsubmit(DesigNated desigNated);
    /**
     * 修改状态
     * 参数：DesigNated对象
     * @return int
     */
    public int updateBystate(DesigNated desigNated);
    /**
     * 修改审核
     * 参数：DesigNated对象
     * @return int
     */
    public int updateByshenhe(DesigNated desigNated);
    /**
     * 修改驳回
     * 参数：DesigNated对象
     * @return int
     */
    public int updateBybohui(DesigNated desigNated);


    /**
     * 修改领取
     * 参数：DesigNated对象
     * @return int
     */
    public int updateByslingqu(DesigNated desigNated);
    /**
     * 修改处理
     * 参数：DesigNated对象
     * @return int
     */
    public int updateBychuli(DesigNated desigNated);
    /**
     * 组长审批查询全部数据
     * @return List<DesigNated>
     */
    public List<DesigNated> designatedApprovalAll(DesigNated desigNated);
    /**
     * 调度员领取查询全部数据
     * @return List<DesigNated>
     */
    public List<DesigNated> designatedReceiveAll(DesigNated desigNated);

}
