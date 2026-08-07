package com.constructor;

public class DefauktConstructor {

	int id;
    String name;

    DefauktConstructor() {
        id = 101;
        name = "Vinay";
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }

    public static void main(String[] args) {

    	DefauktConstructor e = new DefauktConstructor();
        e.display();
    }

}
