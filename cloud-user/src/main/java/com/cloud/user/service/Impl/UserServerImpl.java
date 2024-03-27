package com.cloud.user.service.Impl;

import com.cloud.user.mapper.UserMapper;
import com.cloud.user.pojo.User;
import com.cloud.user.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User find(Integer id) {
        return userMapper.find(id);
    }
}
