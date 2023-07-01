package com.java;

public class Department {
    private String name;
    private String staff;
    private Student student;

    Department(String name, String staff){

        this.name = name;
        this.staff = staff;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStaff(){
        return staff;
    }
    public void setStaff(String staff){
        this.staff = staff;
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public void displayDepartment(){
        System.out.println("Department Details");
        System.out.println("------------------");
        System.out.println("Department Name : "+getName());
        System.out.println("Department Staff Name : "+getStaff());
    }
    public void createStudent(Student student) {
        if (student.getId() != 0 && student.getName() != null && student.getMailId() != null && student.getContactNumber() != 0) {
            this.student = student;
            System.out.println("Student Create Operation Performed Successfully");
        } else {
            System.out.println("Student Doesn't Exist");
        }
    }
       public void readStudent(){
           if(student.getId() != 0 && student.getName() != null && student.getMailId() != null && student.getContactNumber() != 0){
               student.displayStudent();
               System.out.println("Student Read Operation Performed Successfully");
           }
           else{
               System.out.println("Student Doesn't Exist");
           }
        }
       public void updateStudent(int id, String name, String mailId, long contactNumber){
           if(student.getId() != 0 && student.getName() != null && student.getMailId() != null && student.getContactNumber() != 0){
               student.setId(id);
               student.setName(name);
               student.setMailId(mailId);
               student.setContactNumber(contactNumber);
               System.out.println("student Update operation Performed Successfully");
           }
           else{
               System.out.println("Student Doesn't Exist");
           }
        }
       public void deleteStudent(int id){
           if(student.getId()==id){
               this.student=null;
               System.out.println("Student Delete Operation Performed Successfully");
           }
           else{
               System.out.println("student Doesn't Exist");
           }
        }

    }



