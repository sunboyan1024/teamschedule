package com.atguigu.team.service;

/**
 * @author BoyanSun
 * @data 2022/3/19 - 14:33
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33875169124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
