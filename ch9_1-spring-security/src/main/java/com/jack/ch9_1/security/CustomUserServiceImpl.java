package com.jack.ch9_1.security;

import com.jack.ch9_1.dao.SysUserRepository;
import com.jack.ch9_1.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author yangyueming
 */
public class CustomUserServiceImpl implements UserDetailsService { //1

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) { //2
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        return sysUser; //3
    }

}
