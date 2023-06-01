package com.java;

public class Project {
    private int id;
    private String name;
    Project(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){

        this.id = id;
    }
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public void displayProject(){
        System.out.println("Project Details");
        System.out.println("---------------");
        System.out.println("Project Id :"+getId());
        System.out.println("Project Name : "+getName());
    }
}
