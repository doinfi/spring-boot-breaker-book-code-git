package com.jack.ch9_1.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author yangyueming
 */
@Entity
@Data
public class SysUser implements UserDetails { //1

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    @ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
    private List<SysRole> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //2
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        List<SysRole> roles = this.getRoles();
        for (SysRole role : roles) {
            grantedAuthorityList.add(new SimpleGrantedAuthority(role.getName()));
        }
        return grantedAuthorityList;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
