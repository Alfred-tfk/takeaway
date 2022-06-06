package com.takeaway.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.takeaway.common.CustomException;
import com.takeaway.entity.Dish;
import com.takeaway.entity.DishFlavor;
import com.takeaway.entity.Setmeal;
import com.takeaway.mapper.DishFlavorMapper;
import com.takeaway.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
