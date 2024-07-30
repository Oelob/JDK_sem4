package org.example;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) throws TabNumberException {

        Employee empl1 = new Employee(1,
                "89923128267",
                "Ivan",
                5);
        Employee empl2 = new Employee(2,
                "89524123452",
                "Petr",
                3);
        Employee empl3 = new Employee(3,
                "89932345678",
                "Sergei",
                8);
        Employee empl4 = new Employee(4,
                "89932456789",
                "Ivan",
                2);


        EmployeeNote employeeNote = new EmployeeNote();
        employeeNote.addNewEmployee(empl1);
        employeeNote.addNewEmployee(empl2);
        employeeNote.addNewEmployee(empl3);
        employeeNote.addNewEmployee(empl4);
        System.out.println(employeeNote);
        System.out.println(" ");
        System.out.println(employeeNote.getPhoneNumberByName("Ivan"));
        System.out.println(" ");
        System.out.println(employeeNote.searchByWorkExperience(3));
        System.out.println(" ");
        System.out.println(employeeNote.searchEmployeeByTabNumder(4));



    }
}