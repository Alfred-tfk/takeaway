package com.takeaway.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.takeaway.entity.User;
import com.takeaway.mapper.UserMapper;
import com.takeaway.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
