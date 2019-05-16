package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.Menu;
import com.bdqn.pojo.Mishu;
import com.bdqn.service.MenuService;
import com.bdqn.service.MishuService;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class MishuController extends BaseController {
    @Resource
    private MishuService mishuService;

    @PostMapping("mishuAll")
    public String mishuAll(Mishu mishu) {
        List<Mishu> mishuList= mishuService.mishuAll(mishu);
        return dealQueryResult(mishuList,mishuList);
    }

    @PostMapping("mishuAdd")
    public String mishuAdd(Mishu mishu) {
        System.out.println(mishu.getSubmission());
        int row= mishuService.mishuAdd(mishu);
        return dealSuccessResult("增加成功",row);
    }

    @PostMapping("mishuUpdate")
    public String mishuUpdate(Mishu mishu) {
        int row= mishuService.mishuUpdate(mishu);
        return dealSuccessResult("修改成功",row);
    }

    @PostMapping("mishuDelete")
    public String mishuDelete(Integer businessCoding) {
        int row= mishuService.mishuDelete(businessCoding);
        return dealSuccessResult("删除成功",row);
    }

    @PostMapping("mishuById")
    public String mishuById(Integer businessCoding) {
        Mishu mishu= mishuService.mishuById(businessCoding);
        return dealQueryResult(mishu,mishu);
    }

    @PostMapping("caoGaoAll")
    public String caoGaoAll(Mishu mishu) {
        List<Mishu> mishuList= mishuService.caoGaoAll(mishu);
        return dealQueryResult(mishuList,mishuList);
    }

    @PostMapping("caoGaoCount")
    public String caoGaoCount() {
        int row= mishuService.caoGaoCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("boHuiAll")
    public String boHuiAll(Mishu mishu) {
        List<Mishu> mishuList= mishuService.boHuiAll(mishu);
        return dealQueryResult(mishuList,mishuList);
    }

    @PostMapping("boHuiCount")
    public String boHuiCount() {
        int row= mishuService.boHuiCount();
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("approvalAll")
    public String approvalAll(Mishu mishu) {
        List<Mishu> mishuList= mishuService.approvalAll(mishu);
        return dealQueryResult(mishuList,mishuList);
    }

    @PostMapping("approval")
    public String approval(Integer msId) {
        int row= mishuService.approval(msId);
        return dealSuccessResult("查询成功",row);
    }

    @PostMapping("reject")
    public String reject(Integer msId,String rejectInformation) {
        int row= mishuService.reject(msId,rejectInformation);
        return dealSuccessResult("查询成功",row);
    }
}