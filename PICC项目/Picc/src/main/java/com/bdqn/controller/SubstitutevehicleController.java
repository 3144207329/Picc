package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.Substitutevehicle;
import com.bdqn.service.SubstitutevehicleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class SubstitutevehicleController extends BaseController {

    //自动装配
    @Resource
    private SubstitutevehicleService jiancheService;

    //代检车查询所有
    @PostMapping("SubstitutevehicleAll")
    public String SubstitutevehicleAll(Substitutevehicle jianche){
        List<Substitutevehicle> jiancheList= jiancheService.SubstitutevehicleAll(jianche);
        return dealQueryResult(jiancheList,jiancheList);
    }
    //查询所有已提交和未驳回的
    @PostMapping("jianapprovalAll")
    public String jianapprovalAll(Substitutevehicle jianche){
        List<Substitutevehicle> jiancheList= jiancheService.jianapprovalAll(jianche);
        return dealQueryResult(jiancheList,jiancheList);
    }
    //根据id查询
    @PostMapping("jiancheById")
    public String jiancheById(Integer msId){
       Substitutevehicle jianche= jiancheService.jiancheById(msId);
        return dealQueryResult(jianche,jianche);
    }

    //审批
    @PostMapping("jiancheapproval")
    public String approval(Integer msId) {
        int jianche= jiancheService.approval(msId);
        return dealSuccessResult("查询成功",jianche);
    }
    //驳回
    @PostMapping("jianchereject")
    public String jianchereject(Integer msId,String rejectInformation) {
        int jianche= jiancheService.jianchereject(msId,rejectInformation);
        return dealSuccessResult("查询成功",jianche);
    }

    //修改
    @PostMapping("jiancheUpdate")
    public String jiancheUpdate(Substitutevehicle jianche) {
        int row= jiancheService.jiancheUpdate(jianche);
        return dealSuccessResult("修改成功",row);
    }

    //增加
    @PostMapping("jiancheAdd")
    public String jiancheAdd(Substitutevehicle jianche) {
        int row= jiancheService.jiancheAdd(jianche);
        return dealSuccessResult("增加成功",row);
    }

    //删除
    @PostMapping("jiancheDelete")
    public String jiancheDelete(Integer msId) {
        int row= jiancheService.jiancheDelete(msId);
        return dealSuccessResult("删除成功",row);
    }

    //查询已提交和已审批
    @PostMapping("jiancheCarReceive")
    public String jiancheCarReceive(Substitutevehicle jiancheCar){
        List<Substitutevehicle> jiancheCarList= jiancheService.jiancheCarReceive(jiancheCar);
        return dealQueryResult(jiancheCarList,jiancheCarList);
    }
    //
    @PostMapping("jiancheCarUpdate")
    public String jiancheCarUpdate(Integer msId) {
        int row= jiancheService.jiancheCarUpdate(msId);
        return dealSuccessResult("删除成功",row);
    }
//异常所有信息
    @PostMapping("jiancheCarAbnormalCount")
    public String jiancheCarAbnormalCount() {
        int row= jiancheService.jiancheCarAbnormalCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("jiancheCarAbnormalUpdate")
    public String jiancheCarAbnormalUpdate(Integer msId) {
        int row= jiancheService.jiancheCarAbnormalUpdate(msId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("jiancheCarAbnormal")
    public String jiancheCarAbnormal(Substitutevehicle newCar) {
        List<Substitutevehicle> newCarList= jiancheService.jiancheCarAbnormal(newCar);
        return dealQueryResult(newCarList,newCarList);
    }


    //驳回行数
    @PostMapping("jianchebhCount")
    public String jianchebhCount() {
        int row= jiancheService.jianchebhCount();
        return dealSuccessResult("查询成功",row);
    }

    //驳回箱查询所有
    @PostMapping("jianchebhAll")
    public String jianchebhAll(Substitutevehicle mishu) {
        List<Substitutevehicle> mishuList= jiancheService.jianchebhAll(mishu);
        return dealQueryResult(mishuList,mishuList);
    }
    //草稿箱查询所有
    @PostMapping("jianchecaogaoAll")
    public String jianchecaogaoAll(Substitutevehicle cagoao) {
        List<Substitutevehicle> jiancheList=jiancheService.jianchecaogaoAll(cagoao);
        return dealQueryResult(jiancheList,jiancheList);
    }

    //草稿行数
    @PostMapping("jianchecaoGaoCount")
    public String jianchecaoGaoCount() {
        int row= jiancheService.jianchecaoGaoCount();
        return dealSuccessResult("查询成功",row);
    }



}
