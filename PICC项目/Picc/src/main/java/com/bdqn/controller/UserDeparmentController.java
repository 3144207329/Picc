package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.dao.UserDeparmentDao;
import com.bdqn.service.UserDeparmentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class UserDeparmentController extends BaseController {
    @Resource
    private UserDeparmentService userDeparmentService;

    @PostMapping("userDeparmentAdd")
    public String userDeparmentAdd(Integer uid,Integer did){
        int row= userDeparmentService.userDeparmentAdd(uid,did);
        return dealSuccessResult("增加成功",row);
    }

    @PostMapping("userDeparmentUpdate")
    public String userDeparmentUpdate(Integer uid,Integer did,Integer udid){
        int row= userDeparmentService.userDeparmentUpdate(uid,did,udid);
        return dealSuccessResult("修改成功",row);
    }
}
