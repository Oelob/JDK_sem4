package org.example;

/**
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 *  * Табельный номер
 *  * Номер телефона
 *  * Имя
 *  * Стаж
 */
public class Employee {

    private final int tabNum;
    private final String phonenumber;
    private final String name;
    private final int workExperience;

    public Employee(int tabNum, String phonenumber, String name, int workExperience) {
        this.tabNum = tabNum;
        this.phonenumber = phonenumber;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getTabNum() {
        return tabNum;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}



