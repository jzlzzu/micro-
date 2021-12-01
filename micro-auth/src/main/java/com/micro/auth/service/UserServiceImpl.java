package com.micro.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author: jiazhaoliang@zsnetwork.com
 * @Description:
 * @Date: Created in 2021/11/29 17:07
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("UserServiceImpl -- loadUserByUsername");
        if (!"admin".equals(username)) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        String passwd = passwordEncoder.encode("123");
        return new User(username, passwd, AuthorityUtils.commaSeparatedStringToAuthorityList("admin,normal"));
    }
}
