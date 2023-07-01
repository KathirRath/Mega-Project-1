package com.java;

public class University {
    private String name;
    private int code;
    private College college;


     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public int getCode(){
         return code;
     }
     public void setCode(int code){
         this.code = code;
     }
     public College getCollege(){
        return college;
     }
     public void setCollege(College college){
        this.college = college;
     }
     public void displayUniversity(){
         System.out.println("University Details");
         System.out.println("------------------");
         System.out.println("University Name : "+getName());
         System.out.println("University Code : "+getCode());
     }
     public void createCollege(College college){
        if(college.getName() != null && college.getLocation() != null){
            this.college = college;
            System.out.println("college Create Operation Performed Successfully");
        }
        else{
            System.out.println("college doesn't Exist");
        }

     }
    public void readCollege(){
        if(college.getName() != null && college.getLocation() != null){
            college.displayCollege();
            System.out.println("college Read Operation Performed Successfully");
        }
        else{
            System.out.println("college doesn't Exist");
        }
    }
    public void updateCollege(String name, String location) {
        if (college.getName() != null && college.getLocation() != null) {
            college.setName(name);
            college.setLocation(location);
            System.out.println("college Update Operation Performed Successfully");
        }else{
            System.out.println("college Doesn't Exist");
        }
    }
    public void deleteCollege(String name){
        if(college.getName() == name){
            this.college = null;
            System.out.println("College Delete Operation Performed Successfully");
        }
        else{
            System.out.println("College Doesn't Exist");
        }
    }
}
