package com.bdqn.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDeparmentDao {
    public int userDeparmentAdd(@Param("uid")Integer uid,@Param("did")Integer did);
    public int userDeparmentUpdate(@Param("uid")Integer uid,@Param("did")Integer did,@Param("udid")Integer udid);
}
