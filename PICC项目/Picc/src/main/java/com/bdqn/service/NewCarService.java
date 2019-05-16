package com.bdqn.service;

import com.bdqn.pojo.Mishu;
import com.bdqn.pojo.NewCar;

import java.util.List;

public interface NewCarService {
    public List<NewCar> newCarAll(NewCar newCar);
    public int newCarUpdate(NewCar newCar);
    public int newCarAdd(NewCar newCar);
    public int newCarDelete(Integer ncId);
    public NewCar newCarById(Integer ncId);
    public List<NewCar> newCarCaoGao(NewCar newCar);
    public int newCarCaoGaoCount();
    public List<NewCar> newCarBoHuiAll(NewCar newCar);
    public int newCarBoHuiCount();
    public List<NewCar> newCarApprovalAll(NewCar newCar);
    public int newCarApproval(Integer ncId);
    public int newCarReject(Integer ncId,String rejectInformation);
    public List<NewCar> yesNewCarReceive(NewCar newCar);
    public List<NewCar> noNewCarReceive(NewCar newCar);
    public int newCarReceiveUpdate(Integer ncId);
    public int newCarHandleUpdate(Integer ncId);
    public int newCarReceiveCount();
    public int newCarAbnormalUpdate(Integer ncId);
    public int newCarAbnormalCount();
    public List<NewCar> newCarAbnormal(NewCar newCar);
}
