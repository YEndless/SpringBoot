package com.example.dao;

import com.example.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysUserRepository extends JpaRepository<SysUser,Integer>{
    /**
     * 账号查询
     * @param account
     * @return
     */
    SysUser findByAccount(String account) ;

    /**
     * 搜索所有昵称一样用户
     * @param nickname
     * @return
     */
    List<SysUser> findByNicknameLike(String nickname);

    /**
     * 通过昵称模糊查找
     * @param account
     * @return
     */
    SysUser findByAccountLike(String account) ;
    /**
     * 查询一个昵称是（）用户
     * @param nickname
     * @return
     */
    @Query("from SysUser u where u.nickname = :nickname")
    SysUser findUser(@Param("nickname") String nickname) ;

    /**
     * 查询降序
     * @param nickname
     * @return
     */
    @Query("from SysUser u where u.nickname like CONCAT('%',:nickname,'%') order by u.fans desc")
    List<SysUser> findSysUsers(@Param("nickname") String nickname) ;
}
