package com.takeaway.dto;


import com.takeaway.entity.Dish;
import com.takeaway.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
//用于展示页面与服务层之间的数据传输，实体类和展页面不对应时使用
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
