package com.jack.ch9_1.dao;


/**
 * @author yangyueming
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByUsername(String username);

}
