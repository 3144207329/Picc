package com.bdqn.dao;

import com.bdqn.pojo.NewCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewCarDao {
    public List<NewCar> newCarAll(NewCar newCar);
    public int newCarUpdate(NewCar newCar);
    public int newCarAdd(NewCar newCar);
    public int newCarDelete(@Param("ncId")Integer ncId);
    public NewCar newCarById(@Param("ncId")Integer ncId);
    public List<NewCar> newCarCaoGao(NewCar newCar);
    public int newCarCaoGaoCount();
    public List<NewCar> newCarBoHuiAll(NewCar newCar);
    public int newCarBoHuiCount();
    public List<NewCar> newCarApprovalAll(NewCar newCar);
    public int newCarApproval(@Param("ncId")Integer ncId);
    public int newCarReject(@Param("ncId")Integer ncId,@Param("rejectInformation")String rejectInformation);
    public List<NewCar> yesNewCarReceive(NewCar newCar);
    public List<NewCar> noNewCarReceive(NewCar newCar);
    public int newCarReceiveUpdate(@Param("ncId")Integer ncId);
    public int newCarHandleUpdate(@Param("ncId")Integer ncId);
    public int newCarReceiveCount();
    public int newCarAbnormalUpdate(@Param("ncId")Integer ncId);
    public int newCarAbnormalCount();
    public List<NewCar> newCarAbnormal(NewCar newCar);
}
