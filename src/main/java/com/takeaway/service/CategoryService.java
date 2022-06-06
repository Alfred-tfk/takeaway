package com.takeaway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.takeaway.entity.Category;


public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
