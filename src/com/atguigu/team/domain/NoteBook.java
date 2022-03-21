package com.atguigu.team.domain;

/**
 * @author BoyanSun
 * @data 2022/3/19 - 14:49
 */
public class NoteBook implements Equipment{
    String model;
    String price;

    public NoteBook(){super();}
    public NoteBook(String model,String price){
        super();
        this.model = model;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
