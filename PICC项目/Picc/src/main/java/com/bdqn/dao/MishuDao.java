package com.bdqn.dao;

import com.bdqn.pojo.Mishu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MishuDao {
    public List<Mishu> mishuAll(Mishu mishu);
    public int mishuUpdate(Mishu mishu);
    public int mishuAdd(Mishu mishu);
    public int mishuDelete(@Param("msId")Integer msId);
    public Mishu mishuById(@Param("msId")Integer msId);
    public List<Mishu> caoGaoAll(Mishu mishu);
    public int caoGaoCount();
    public List<Mishu> boHuiAll(Mishu mishu);
    public int boHuiCount();
    public List<Mishu> approvalAll(Mishu mishu);
    public int approval(@Param("msId")Integer msId);
    public int reject(@Param("msId")Integer msId,@Param("rejectInformation")String rejectInformation);
}
