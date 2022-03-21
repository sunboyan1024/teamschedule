package com.atguigu.team.domain;

/**
 * @author BoyanSun
 * @data 2022/3/19 - 14:51
 */
public class Printer implements Equipment{
    String name;
    String type;

    public Printer(){super();}
    public Printer(String name,String type){
        super();
        this.name = name;
        this.type =type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
