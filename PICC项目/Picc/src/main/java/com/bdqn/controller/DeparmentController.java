package com.bdqn.controller;

import com.bdqn.common.web.BaseController;
import com.bdqn.dao.DeparmentDao;
import com.bdqn.pojo.Department;
import com.bdqn.service.DeparmentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class DeparmentController extends BaseController {
    @Resource
    private DeparmentService deparmentService;

    @PostMapping("departmentAll")
    public String departmentAll(){
        List<Department> deparmentDaoList=deparmentService.departmentAll();
        return dealQueryResult(deparmentDaoList,deparmentDaoList);
    }
}

