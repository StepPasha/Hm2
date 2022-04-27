package ru.gb.stepanov.hm5;

public class Informationaboutemployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "Firefighter", "fire@emil.com", 8907438, 64000, 48);
        employees[1] = new Employee("Alexey", "Smirnov", "programmer", "prog@mal.com", 894563, 44000, 25);
        employees[2] = new Employee("Igor", "Petrov", "Watchman", "watch@peml.com", 893123, 12000, 24);
        employees[3] = new Employee("Sergey", "Sergeev", "Security", "security@mal.com", 8912342, 15000, 52);
        employees[4] = new Employee("Nikolay", "Baskov", "manager", "nBaskov@mel.com", 8943234, 72000, 43);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                employees[i].contentInfomation();
            }


            }
        }
    }

