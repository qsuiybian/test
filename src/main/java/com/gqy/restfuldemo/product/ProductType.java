package com.gqy.restfuldemo.product;

import java.util.List;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-31
 */
public class ProductType {
    private Integer type;
    private String name;
    private List<ProductView> productViews;

    public ProductType() {
    }

    public ProductType(Integer type, String name, List<ProductView> productViews) {
        this.type = type;
        this.name = name;
        this.productViews = productViews;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductView> getProductViews() {
        return productViews;
    }

    public void setProductViews(List<ProductView> productViews) {
        this.productViews = productViews;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", productInfos=" + productViews +
                '}';
    }
}
