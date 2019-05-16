package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.DesigNated;
import com.bdqn.service.DesigNateService;
import org.hibernate.validator.constraints.URL;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/desig")
public class DesigNateController extends BaseController {
    @Resource
    private DesigNateService desigNateService;
    /**
     * 查询全部信息
     * @return List<DesigNated>
     */
    @PostMapping("/listdesig")
    public  String ListByDesigNated(DesigNated desigNated){
        List<DesigNated> desigNatedwen=desigNateService.ListByDesigNated(desigNated);
        return dealQueryResult(desigNatedwen,desigNatedwen);
    }
    /**
     * 查询全部信息
     * @return List<DesigNated>
     */
    @PostMapping("/designatedApprovalAll")
    public  String designatedApprovalAll(DesigNated desigNated){
        List<DesigNated> desigNatedwen=desigNateService.designatedApprovalAll(desigNated);
        return dealQueryResult(desigNatedwen,desigNatedwen);
    }
    /**
     * 查询全部信息
     * @return List<DesigNated>
     */
    @PostMapping("/designatedReceiveAll")
    public  String designatedReceiveAll(DesigNated desigNated){
        List<DesigNated> desigNatedwen=desigNateService.designatedReceiveAll(desigNated);
        return dealQueryResult(desigNatedwen,desigNatedwen);
    }
    /**
     * 查询单一数据
     * 参数：id
     * @return DesigNated对象
     */
    @PostMapping("/GetById")
    public  String GetById(DesigNated desigNated){
        DesigNated desigNateds=desigNateService.GetById(desigNated);
        return dealQueryResult(desigNateds,desigNateds);
    }
    /**
     * 修改数据
     * 参数：DesigNated对象
     * @return int
     */
    @PostMapping("/updateBydgId")
    public String updateBydgId(DesigNated desigNated){
     int result=desigNateService.updateBydgId(desigNated);
        System.err.println(result);
        return dealSuccessResult("修改成功",result);


    }
    /**
     * 修改数据
     * 参数：DesigNated对象
     * @return int
     */
    @PostMapping("/insertOne")
    public String insertOne(DesigNated desigNated){
        int result=desigNateService.insertOne(desigNated);
        System.err.println(result);
        return dealSuccessResult("增加成功",result);
    }
    @PostMapping("/insertsubmit")
    public String insertsubmit(DesigNated desigNated) {
        int result=desigNateService.insertsubmit(desigNated);
        System.err.println(result);
        return dealSuccessResult("增加成功",result);
    }
    @PostMapping("/updateBystate")
    public String updateBystate(DesigNated desigNated) {
        int result=desigNateService.updateBystate(desigNated);
        System.err.println(result);
        return dealSuccessResult("修改成功",result);
    }
    @PostMapping("/updateByshenhe")
    public String updateByshenhe(DesigNated desigNated){
        int result=desigNateService.updateByshenhe(desigNated);
        return dealQueryResult("修改成功",result);
    }
    @PostMapping("/updateBybohui")
    public String updateBybohui(DesigNated desigNated){
        int result=desigNateService.updateByshenhe(desigNated);
        return dealQueryResult("修改成功",result);
    }
    @PostMapping("/updateByslingqu")
    public String updateByslingqu(DesigNated desigNated){
        int result=desigNateService.updateByslingqu(desigNated);
        return dealQueryResult("修改成功",result);
    }
    @PostMapping("/updateBychuli")
    public String updateBychuli(DesigNated desigNated){
        int result=desigNateService.updateBychuli(desigNated);
        return dealQueryResult("修改成功",result);
    }

}
