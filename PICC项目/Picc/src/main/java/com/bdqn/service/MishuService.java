package com.bdqn.service;

import com.bdqn.pojo.Mishu;

import java.util.List;

public interface MishuService {
    public List<Mishu> mishuAll(Mishu mishu);
    public int mishuUpdate(Mishu mishu);
    public int mishuAdd(Mishu mishu);
    public int mishuDelete(Integer msId);
    public Mishu mishuById(Integer msId);
    public List<Mishu> caoGaoAll(Mishu mishu);
    public int caoGaoCount();
    public List<Mishu> boHuiAll(Mishu mishu);
    public int boHuiCount();
    public List<Mishu> approvalAll(Mishu mishu);
    public int approval(Integer msId);
    public int reject(Integer msId,String rejectInformation);
}
