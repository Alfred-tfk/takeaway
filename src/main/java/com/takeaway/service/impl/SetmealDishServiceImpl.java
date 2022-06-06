package com.takeaway.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.takeaway.entity.SetmealDish;
import com.takeaway.mapper.SetmealDishMapper;
import com.takeaway.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
