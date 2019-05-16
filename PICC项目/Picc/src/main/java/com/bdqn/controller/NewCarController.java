package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.NewCar;
import com.bdqn.service.NewCarService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class NewCarController extends BaseController {
    @Resource
    private NewCarService newCarService;

    @PostMapping("newCarAll")
    public String newCarAll(NewCar newCar) {
        List<NewCar> newCarList= newCarService.newCarAll(newCar);
        return dealQueryResult(newCarList,newCarList);
    }

    @PostMapping("newCarAdd")
    public String newCarAdd(NewCar newCar,String licensePlate2,String licensePlate3) {
        int row= newCarService.newCarAdd(newCar);
        if (licensePlate2 != null){
            System.out.println(licensePlate2);
            newCar.setLicensePlate(licensePlate2);
            row= newCarService.newCarAdd(newCar);
        }
        if (licensePlate3 != null){
            System.out.println(licensePlate3);
            newCar.setLicensePlate(licensePlate3);
            row= newCarService.newCarAdd(newCar);
        }
        return dealSuccessResult("增加成功",row);
    }

    @PostMapping("newCarUpdate")
    public String newCarUpdate(NewCar newCar) {
        int row= newCarService.newCarUpdate(newCar);
        return dealSuccessResult("修改成功",row);
    }

    @PostMapping("newCarDelete")
    public String newCarDelete(Integer ncId) {
        int row= newCarService.newCarDelete(ncId);
        return dealSuccessResult("删除成功",row);
    }

    @PostMapping("newCarById")
    public String newCarById(Integer ncId) {
        NewCar newCar= newCarService.newCarById(ncId);
        return dealQueryResult(newCar,newCar);
    }

    @PostMapping("newCarCaoGao")
    public String newCarCaoGao(NewCar newCar) {
        List<NewCar> newCarList= newCarService.newCarCaoGao(newCar);
        return dealQueryResult(newCarList,newCarList);
    }

    @PostMapping("newCarCaoGaoCount")
    public String newCarCaoGaoCount() {
        int row= newCarService.newCarCaoGaoCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarBoHuiAll")
    public String newCarBoHuiAll(NewCar newCar) {
        List<NewCar> newCarList= newCarService.newCarBoHuiAll(newCar);
        return dealQueryResult(newCarList,newCarList);
    }

    @PostMapping("newCarBoHuiCount")
    public String newCarBoHuiCount() {
        int row= newCarService.newCarBoHuiCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarApprovalAll")
    public String newCarApprovalAll(NewCar newCar) {
        List<NewCar> newCarList= newCarService.newCarApprovalAll(newCar);
        return dealQueryResult(newCarList,newCarList);
    }

    @PostMapping("newCarApproval")
    public String newCarApproval(Integer ncId) {
        int row= newCarService.newCarApproval(ncId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarReject")
    public String newCarReject(Integer ncId,String rejectInformation) {
        int row= newCarService.newCarReject(ncId,rejectInformation);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("yesNewCarReceive")
    public String yesNewCarReceive(NewCar newCar) {
        List<NewCar> newCarList= newCarService.yesNewCarReceive(newCar);
        return dealQueryResult(newCarList,newCarList);
    }

    @PostMapping("noNewCarReceive")
    public String noNewCarReceive(NewCar newCar) {
        List<NewCar> newCarList= newCarService.noNewCarReceive(newCar);
        return dealQueryResult(newCarList,newCarList);
    }


    @PostMapping("newCarReceiveUpdate")
    public String newCarReceiveUpdate(Integer ncId) {
        int row= newCarService.newCarReceiveUpdate(ncId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarHandleUpdate")
    public String newCarHandleUpdate(Integer ncId) {
        int row= newCarService.newCarHandleUpdate(ncId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarReceiveCount")
    public String newCarReceiveCount() {
        int row= newCarService.newCarReceiveCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarAbnormalUpdate")
    public String newCarAbnormalUpdate(Integer ncId) {
        int row= newCarService.newCarAbnormalUpdate(ncId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarAbnormalCount")
    public String newCarAbnormalCount() {
        int row= newCarService.newCarAbnormalCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("newCarAbnormal")
    public String newCarAbnormal(NewCar newCar) {
        List<NewCar> newCarList= newCarService.newCarAbnormal(newCar);
        return dealQueryResult(newCarList,newCarList);
    }
}