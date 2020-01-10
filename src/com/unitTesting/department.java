package com.unitTesting;

public class department {

    private static int departmentId;
    private String name;
    private int num;

    public department(String name,int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
