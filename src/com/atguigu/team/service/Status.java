package com.atguigu.team.service;

/**
 * @author BoyanSun
 * @data 2022/3/19 - 15:04
 */
public class Status {
    private final String NAME;
    public Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}
