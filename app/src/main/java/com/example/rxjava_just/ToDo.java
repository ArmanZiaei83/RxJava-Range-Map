package com.example.rxjava_just;

public class ToDo {

    String name;
    boolean isDoneOrNot;

    public ToDo(String name, boolean isDoneOrNot) {
        this.name = name;
        this.isDoneOrNot = isDoneOrNot;
    }

    public String getName() {
        return name;
    }
}
