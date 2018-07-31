package com.gqy.restfuldemo;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-31
 */
public class Food {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private String icon;

    public Food() {
    }

    public Food(Integer id, String name, Double price, String description, String icon) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
