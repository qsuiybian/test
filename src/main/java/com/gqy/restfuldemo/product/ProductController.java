package com.gqy.restfuldemo.product;

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
        List<ProductView> productViewList1 = new ArrayList<>();
        productViewList1.add(new ProductView(1, "food1", 10.1, "description1", "http://icon.com"));
        productViewList1.add(new ProductView(2, "food2", 10.2, "description2", "http://icon.com"));
        productViewList1.add(new ProductView(3, "food3", 10.3, "description3", "http://icon.com"));
        List<ProductView> productViewList2 = new ArrayList<>();
        productViewList2.add(new ProductView(4, "food4", 10.4, "description4", "http://icon.com"));
        productViewList2.add(new ProductView(5, "food5", 10.5, "description5", "http://icon.com"));
        productViewList2.add(new ProductView(6, "food6", 10.6, "description6", "http://icon.com"));
        List<ProductType> produces = new ArrayList<>();
        produces.add(new ProductType(1, "type1", productViewList1));
        produces.add(new ProductType(2, "type2", productViewList2));
        Map<String,Object> result = new HashMap<>(6);
        result.put("msg","success");
        result.put("data",produces);
        return result;
    }
}
