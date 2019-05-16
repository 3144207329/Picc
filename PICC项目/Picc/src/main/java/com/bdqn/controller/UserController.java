package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class UserController extends BaseController {
    @Resource
    private UserService userService;

    @PostMapping("userLogin")
    public String userLogin(String userCode, String userPwd){
        User user= userService.userLogin(userCode,userPwd);
        return dealQueryResult(user,user);
    }

    @PostMapping("updateUserPwd")
    public String updateUserPwd(String userPwd, String userCode){
        int row= userService.updateUserPwd(userPwd,userCode);
        return dealSuccessResult("增加成功",row);
    }

    @PostMapping("userAdd")
    public String userAdd(User user){
        int row= userService.userAdd(user);
        return dealSuccessResult("增加成功",row);
    }

    @PostMapping("userUpdate")
    public String userUpdate(User user){
        int row= userService.userUpdate(user);
        return dealSuccessResult("修改成功",row);
    }

    @PostMapping("userDeleteState")
    public String userDeleteState(String userCode){
        int row= userService.userDeleteState(userCode);
        return dealSuccessResult("删除成功",row);
    }

    @PostMapping("userByCode")
    public String userByCode(String userCode){
        User user= userService.userByCode(userCode);
        return dealQueryResult(user,user);
    }

    @PostMapping("userById")
    public String userById(String userCode){
        User user= userService.userById(userCode);
        return dealQueryResult(user,user);
    }

    @PostMapping("userAll")
    public String userAll(User user){
        List<User> userList= userService.userAll(user);
        return dealQueryResult(userList,userList);
    }
}
