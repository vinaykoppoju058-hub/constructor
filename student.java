package com.constructor;

public class student {
	String name;
    int java;
    int sql;
    int web;
    student(String name, int java, int sql, int web) {
        this.name = name;
        this.java = java;
        this.sql = sql;
        this.web = web;
    }

    void result() {

        int total = java + sql + web;
        double percentage = total / 3.0;

        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }

    public static void main(String[] args) {
        student s = new student("Vinay", 90, 85, 95);

        s.result();
    }
}

