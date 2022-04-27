package ru.gb.stepanov.hm5;

public class Employee {
    private String firstname;
    private String lastname;
    private String post;
    private String email;
    private int telephone;
    private int salary;
     private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Employee(String firstname, String lastname, String post, String email, int telephone, int salary, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
        public void contentInfomation() {
            System.out.println("Firstname: " +firstname+ " Lastname: "+lastname+ " Post: "+post+ " Email: "+email+" Telephone: "+telephone+" Salary: "+salary+" Age: "+age);
        }
    public int getAge() {
        return age;
    }
}

