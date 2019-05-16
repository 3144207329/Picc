package com.bdqn.service;

import com.bdqn.pojo.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> shu(Integer rid);
    public List<Menu> zi(Integer rid,Integer pid);
}
