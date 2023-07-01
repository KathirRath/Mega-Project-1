package com.java;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private static boolean data = true;
    private static boolean data1 = true;
    private static University university;
    private static College college;
    private static Department department;
    private static Student student;
    private static Project project;

    public static void main(String[] args) {
        do {
                System.out.println("Select your Choice");
                System.out.println("------------------");
                System.out.println("1.Select the University");
                System.out.println("2.Select the College");
                System.out.println("3.Select the Department");
                System.out.println("4.Select the Student");
                System.out.println("5.Select the Project");
                System.out.println("6.Exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1 :{
                    do{
                        System.out.println("Select the CRED in University");
                        System.out.println("-------------------------");
                        System.out.println("1.Create the University");
                        System.out.println("2.Read the University");
                        System.out.println("3.Update the University");
                        System.out.println("4.Delete the University");
                        System.out.println("5.Create the College");
                        System.out.println("6.Read the College");
                        System.out.println("7.Update the College");
                        System.out.println("8.Delete the College");
                        System.out.println("9.Exit");

                        int option = scanner.nextInt();
                        switch(option){
                            case 1:{
                                 university = new University();
                                System.out.println("University Create Operation Performed  Successfully!");
                            }
                            break;

                            case 2:{
                                university.displayUniversity();
                                System.out.println("University Read Operation Performed Successfully!");
                            }
                            break;

                            case 3:{
                                System.out.println("Enter University Name : ");
                                String name = scanner.next();
                                university.setName( name);
                                System.out.println("Enter University code : ");
                                int code = scanner.nextInt();
                                university.setCode(code);
                            }
                            break;
                            case 4:{
                                university = null;
                                System.out.println("University Delete Operation Performed Successfully");
                            }
                            break;
                            case 5:{

                                System.out.println("Enter the College Name : ");
                                String name = scanner.next();
                                System.out.println("Enter th College Location  : ");
                                String location = scanner.next();
                                college = new College(name,location);
                                university.createCollege(college);
                            }
                            break;
                            case 6:{
                                university.readCollege();

                            }
                            break;

                            case 7:{
                                System.out.println("Enter College  Name : ");
                                String name = scanner.next();
                                System.out.println("Enter College  Location : ");
                                String location = scanner.next();
                                university.updateCollege(name,location);



                            }
                            break;
                            case 8:{
                                String name = scanner.next();

                                university.deleteCollege(name);

                            }
                            break;
                            case 9:{
                                data1 = false;
                                System.out.println("Back To Main");
                            }
                            break;
                            default:{
                                System.out.println("Invalid Choice! Try Again!");
                            }
                            break;
                        }

                    }while(data1);

                }
                break;
                case 2:{
                    do{
                        System.out.println("Select the CRED in College");
                        System.out.println("-------------------------");
                        System.out.println("1.Create the College");
                        System.out.println("2.Read the College");
                        System.out.println("3.Update the College");
                        System.out.println("4.Delete the College");
                        System.out.println("5.Create the Department");
                        System.out.println("6.Read the Department");
                        System.out.println("7.Update the Department");
                        System.out.println("8.Delete the Department");
                        System.out.println("9.Exit");

                        int option = scanner.nextInt();
                        switch(option){
                            case 1:{
                                System.out.println("Enter the College Name : ");
                                String name = scanner.next();
                                System.out.println("Enter th College Location  : ");
                                String location = scanner.next();
                                college = new College(name,location);
                                university.createCollege(college);
                            }
                            break;

                            case 2:{
                                university.readCollege();
                            }
                            break;

                            case 3:{

                                System.out.println("Enter College  Name : ");
                                String name = scanner.next();
                                System.out.println("Enter College  Location : ");
                                String location = scanner.next();
                                university.updateCollege(name, location);
                            }
                            break;
                            case 4:{
                                String name = scanner.next();
                                university.deleteCollege(name);
                            }
                            break;
                            case 5:{
                                System.out.println("Enter the Department Name : ");
                                String name = scanner.next();
                                System.out.println("Enter th Department Location  : ");
                                String staff = scanner.next();
                                department = new Department(name,staff);
                                college.createDepartment(department);
                            }
                            break;
                            case 6:{
                                college.readDepartment();
                            }
                            break;

                            case 7:{
                                System.out.println("Enter Department  Name : ");
                                String name = scanner.next();
                                System.out.println("Enter Department  Staff : ");
                                String staff = scanner.next();
                                college.updateDepartment(name,staff);
                            }
                            break;
                            case 8:{
                                String name = scanner.next();
                                college.deleteDepartment(name);
                            }
                            break;
                            case 9:{
                                data1 = false;
                            }
                            break;
                            default:{
                                System.out.println("Invalid Choice! Try Again!");
                            }
                            break;
                        }

                    }while(data1);
                }
                break;
                case 3:{
                    do{
                        System.out.println("Select the CRED in Department");
                        System.out.println("-------------------------");
                        System.out.println("1.Create the Department");
                        System.out.println("2.Read the Department");
                        System.out.println("3.Update the Department");
                        System.out.println("4.Delete the Department");
                        System.out.println("5.Create the Student");
                        System.out.println("6.Read the Student");
                        System.out.println("7.Update the Student");
                        System.out.println("8.Delete the Student");
                        System.out.println("9.Exit");

                        int option = scanner.nextInt();
                        switch(option){
                            case 1:{
                                System.out.println("Enter the Department Name : ");
                                String name = scanner.next();
                                System.out.println("Enter th Department Location  : ");
                                String staff = scanner.next();
                                department = new Department(name,staff);
                                college.createDepartment(department);
                            }
                            break;

                            case 2:{
                                college.readDepartment();
                            }
                            break;

                            case 3:{
                                System.out.println("Enter Department  Name : ");
                                String name = scanner.next();
                                System.out.println("Enter Department  Staff : ");
                                String staff = scanner.next();
                                college.updateDepartment(name, staff);
                            }
                            break;
                            case 4:{
                                String name = scanner.next();
                                college.deleteDepartment(name);
                                System.out.println("Department  Delete Operation Performed Successfully");
                            }
                            break;
                            case 5:{
                                System.out.println("Enter the Student Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter th Student Name  : ");
                                String name = scanner.next();
                                System.out.println("Enter th Student mailId  : ");
                                String mailId= scanner.next();
                                System.out.println("Enter the Student ContactNumber : ");
                                long contactNumber = scanner.nextLong();
                                student = new Student(id, name, mailId, contactNumber);
                                department.createStudent(student);
                            }
                            break;
                            case 6:{
                                department.readStudent();
                            }
                            break;

                            case 7:{
                                System.out.println("Enter Student Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter Student  Name : ");
                                String name = scanner.next();
                                System.out.println("Enter Student  MailId : ");
                                String mailId = scanner.next();
                                System.out.println("Enter Student Contact Number : ");
                                long contactNumber = scanner.nextLong();
                                department.updateStudent(id, name, mailId, contactNumber);

                            }
                            break;
                            case 8:{
                                int id = scanner.nextInt();
                                department.deleteStudent(id);
                            }
                            break;
                            case 9:{
                                data1 = false;
                            }
                            break;
                            default:{
                                System.out.println("Invalid Choice! Try Again!");
                            }
                            break;
                        }

                    }while(data1);
                }
                break;
                case 4:{
                    do{
                        System.out.println("Select the CRED in Student");
                        System.out.println("-------------------------");
                        System.out.println("1.Create the Student");
                        System.out.println("2.Read the Student");
                        System.out.println("3.Update the Student");
                        System.out.println("4.Delete the Student");
                        System.out.println("5.Create the Project");
                        System.out.println("6.Read the Project");
                        System.out.println("7.Update the Project");
                        System.out.println("8.Delete the Project");
                        System.out.println("9.Exit");

                        int option = scanner.nextInt();
                        switch(option){
                            case 1:{
                                System.out.println("Enter the Student Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter th Student Name  : ");
                                String name = scanner.next();
                                System.out.println("Enter th Student mailId  : ");
                                String mailId= scanner.next();
                                System.out.println("Enter the Student ContactNumber : ");
                                long contactNumber = scanner.nextLong();
                                student = new Student(id, name, mailId, contactNumber);
                                department.createStudent(student);
                            }
                            break;

                            case 2:{
                                department.readStudent();
                            }
                            break;

                            case 3:{

                                System.out.println("Enter Student Id : ");
                                int id = scanner.nextInt();

                                System.out.println("Enter Student  Name : ");
                                String name = scanner.next();

                                System.out.println("Enter Student  MailId : ");
                                String mailId = scanner.next();

                                System.out.println("Enter Student Contact Number : ");
                                long contactNumber = scanner.nextLong();
                                department.updateStudent(id, name, mailId, contactNumber);
                            }
                            break;
                            case 4:{
                                int id = scanner.nextInt();
                                department.deleteStudent(id);
                            }
                            break;
                            case 5:{
                                System.out.println("Enter Project Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter Project  Name : ");
                                String name = scanner.next();
                                project = new Project(id,name);
                            }
                            break;
                            case 6:{
                                student.readTheProject();
                            }
                            break;

                            case 7:{
                                System.out.println("Enter Project Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter Project  Name : ");
                                String name = scanner.next();
                                student.updateTheProject(id, name);
                            }
                            break;
                            case 8:{
                                int id = scanner.nextInt();
                               student.deleteTheProject(id);
                            }
                            break;
                            case 9:{
                                data1 = false;
                            }
                            break;
                            default:{
                                System.out.println("Invalid Choice! Try Again!");
                            }
                            break;
                        }

                    }while(data1);
                }
                break;
                case 5:{
                    do{
                        System.out.println("Select the CRED in Project");
                        System.out.println("--------------------------");
                        System.out.println("1.Create the Project");
                        System.out.println("2.Read the Project");
                        System.out.println("3.Update the Project");
                        System.out.println("4.Delete the Project");
                        System.out.println("5.Exit");

                        int option = scanner.nextInt();
                        switch(option){

                            case 1:{
                                System.out.println("Enter the Project-Id");
                                int id = scanner.nextInt();
                                System.out.println("Enter the Project-Name");
                                String name = scanner.next();
                                project = new Project(id, name);
                                student.createTheProject(project);

                            }
                            break;
                            case 2:{
                                student.readTheProject();
                            }
                            break;

                            case 3:{
                                System.out.println("Enter Project Id : ");
                                int id = scanner.nextInt();
                                System.out.println("Enter Project  Name : ");
                                String name = scanner.next();
                                student.updateTheProject(id, name);
                            }
                            break;
                            case 4:{
                                int id = scanner.nextInt();
                                student.deleteTheProject(id);
                            }
                            break;
                            case 5:{
                                data1 = false;
                            }
                            break;
                            default:{
                                System.out.println("Invalid Choice! Try Again!");
                            }
                            break;
                        }

                    }while(data1);
                }
                break;
                case 6:{
                    data = false;
                    System.out.println("Thank You! Visit Again!");
                }
                break;
                default:{
                    System.out.println("Invalid Choice! Try Again!");
                }
            }

        } while (data);
    }
}
