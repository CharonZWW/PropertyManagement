package com.wsw.management.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IManagerDao {
    /**
     * 通过账号查询密码
     * @param user
     * @return
     */
    @Select("select m_password from manager where m_username=#{user}")
    String findPassByUser(String user);
}
