package com.gqy.restfuldemo;

import java.util.List;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-31
 */
public class Produce {
    private Integer type;
    private String name;
    private List<Food> foods;

    public Produce() {
    }

    public Produce(Integer type, String name, List<Food> foods) {
        this.type = type;
        this.name = name;
        this.foods = foods;
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

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Produce{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", foods=" + foods +
                '}';
    }
}
