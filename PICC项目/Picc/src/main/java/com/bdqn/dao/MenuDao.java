package com.bdqn.dao;

import com.bdqn.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    public List<Menu> shu(@Param("rid")Integer rid);
    public List<Menu> zi(@Param("rid")Integer rid,@Param("pid")Integer pid);
}
