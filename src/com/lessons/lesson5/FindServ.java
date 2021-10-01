package com.lessons.lesson5;

public interface FindServ {

    public default boolean findempl(Director dir, String name) {

        Employee[] employees = dir.getEmployees();
        for (Employee employee : employees) {
            String emplName = employee.FirstName;
            if (emplName.equals(name)){
                System.out.println("Сотрудник " + employee.FirstName + " найден");
                return true;

            }
            if (employee.position.equals(PositionEnum.DIRECTOR)){
                System.out.println("Сотрудник " + employee.FirstName + " не найден");
                return findempl((Director) employee, name);

            }
        }
        return false;

    }

}
