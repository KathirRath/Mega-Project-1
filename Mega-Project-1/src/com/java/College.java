package com.java;

public class College {
    private String name;
    private String location;
    private Department department;

     College(String name, String location) {

         this.name = name;
         this.location = location;
     }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(){
        this.department = department;
    }
    public void displayCollege(){
        System.out.println("College Details");
        System.out.println("---------------");
        System.out.println("College Name : "+getName());
        System.out.println("College Location : "+getLocation());
    }
    public void createDepartment(Department department){
        if(department.getName() != null && department.getStaff() != null){
                this.department = department;
            System.out.println("Department Create Operation Performed Successfully");
        }
        else{
            System.out.println("Department doesn't Exist");
        }

    }
    public void readDepartment(){
        if(department.getName() != null && department.getStaff() != null){
            department.displayDepartment();
            System.out.println("Department Read Operation Performed Successfully");
        }
        else{
            System.out.println("Department doesn't Exist");
        }
    }
    public void updateDepartment(String name, String staff) {
        if (department.getName() != null && department.getStaff() != null) {
            department.setName(name);
            department.setStaff(staff);
            System.out.println("Department Update Operation Performed Successfully");
        }else{
            System.out.println("Department Doesn't Exist");
        }
    }
    public void deleteDepartment(String name){
        if(department.getName() == name){
            this.department = null;
            System.out.println("Department Delete Operation Performed Successfully");
        }
        else{
            System.out.println("Department Doesn't Exist");
        }
    }
}
