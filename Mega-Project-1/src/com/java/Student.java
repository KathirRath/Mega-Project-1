package com.java;

public class Student {
    private int id;
    private String name;
    private String mailId;
    private long contactNumber;
    private Project project;

    Student(int id, String name, String mailId, long contactNumber){

        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.contactNumber = contactNumber;
    }



    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getMailId(){
        return  mailId;
    }
    public void setMailId(String mailId){
        this.mailId = mailId;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){

        this.contactNumber = contactNumber;
    }
    public Project getProject(){

        return project;
    }
    public void setProject(Project project){

        this.project = project;
    }
    public void displayStudent(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student Id : "+getId());
        System.out.println("Student Name : "+getName());
        System.out.println("Student Mail Id : "+getMailId());
        System.out.println("Student Contact Number : "+getContactNumber());
    }
    public void createTheProject(Project project){
        if(project.getId()!= 0 && project.getName()!= null){
            this.project = project;
            System.out.println("Project Create Operation Performed Successfully");
        }
        else{
            System.out.println("Project doesn't Exist");
        }

    }
    public void readTheProject(){
        if(project.getId() != 0 && project.getName() != null ){
            project.displayProject();
            System.out.println("Project read Operation Performed Successfully!");
        }else{
            System.out.println("Project doesn't Exist");
        }
    }
    public void updateTheProject(int id,String name){
        if(project.getId()!=0 && project.getName()!= null){
            project.setId(id);
            project.setName(name);
            System.out.println("Project update Operation Performed Successfully");
        } else{
            System.out.println("Project doesn't Exist");
        }
    }
    public void deleteTheProject(int id){
        if(project.getId()==id){
            this.project = null;
            System.out.println("Project Delete Operation Performed Successfully");
        }else{
            System.out.println("Project doesn't Exist");
        }
    }

}
