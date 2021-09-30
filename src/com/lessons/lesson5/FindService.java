package com.lessons.lesson5;

public class FindService {

            public boolean findempl (Director dir, String name) {

            Employee[] employees = dir.getEmployees();
            for (Employee employee : employees) {
                String emplName = employee.FirstName;
                if (emplName.equals(name)){
                    return true;
                }
                if (employee.position.equals(PositionEnum.DIRECTOR)){
                    return findempl((Director) employee, name);
                }
            }
            return false;
        }





}
