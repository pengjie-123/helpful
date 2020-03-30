package com.pj.helpful.util;

import sun.applet.Main;

public class Person {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Person(){}
    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Integer a=11;
        Integer b=116;
        String str="abc123gfh";
        char [] ch=str.toCharArray();

        System.out.println(a.compareTo(b));
        System.out.println(2^16);
    }
}
