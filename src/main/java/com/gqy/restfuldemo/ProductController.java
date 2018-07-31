package com.gqy.restfuldemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-31
 */
@RestController
@RequestMapping("/sell/buyer/product")
public class ProductController {


    @RequestMapping("/list")
    public Map<String,Object> getProduct(){
        List<Food> foodList1 = new ArrayList<>();
        foodList1.add(new Food(1, "food1", 10.1, "description1", "http://icon.com"));
        foodList1.add(new Food(2, "food2", 10.2, "description2", "http://icon.com"));
        foodList1.add(new Food(3, "food3", 10.3, "description3", "http://icon.com"));
        List<Food> foodList2 = new ArrayList<>();
        foodList2.add(new Food(4, "food4", 10.4, "description4", "http://icon.com"));
        foodList2.add(new Food(5, "food5", 10.5, "description5", "http://icon.com"));
        foodList2.add(new Food(6, "food6", 10.6, "description6", "http://icon.com"));
        List<Produce> produces = new ArrayList<>();
        produces.add(new Produce(1, "type1", foodList1));
        produces.add(new Produce(2, "type2", foodList2));
        Map<String,Object> result = new HashMap<>();
        result.put("msg","success");
        result.put("data",produces);
        return result;
    }
}
