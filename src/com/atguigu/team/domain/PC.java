package com.atguigu.team.domain;

/**
 * @author BoyanSun
 * @data 2022/3/19 - 14:46
 */
public class PC implements Equipment{
    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
    String model;
    String display;

    public PC(){

    }
    public PC(String model,String display){
        super();
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
