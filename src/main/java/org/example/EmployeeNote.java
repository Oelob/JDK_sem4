package org.example;

import java.util.*;

public class EmployeeNote {

    private List<Employee> employees = new LinkedList<>();

    public EmployeeNote() {
    }

    //Добавление нового сотрудника
    public List<Employee> addNewEmployee(Employee employee){
        employees.add(employee);
        return employees;
    }

    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> searchByWorkExperience(int workExperience){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getWorkExperience() >= workExperience){
                 result.add(employee);
            }
        }
        return result;

    }

    //Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    public List<Map> getPhoneNumberByName (String name){
        List<Map> res = new ArrayList<>();
        for (Employee employee : employees) {
            if (Objects.equals(employee.getName(), name)){
                Map<String, String> newPair = new HashMap<>();
                newPair.put(employee.getName(),employee.getPhonenumber());
                res.add(newPair);
            }
        }
        return res;
    }

    //Добавить метод, который ищет сотрудника по табельному номеру
    public Employee searchEmployeeByTabNumder (int tabNumber) throws TabNumberException {
        for (Employee employee : employees) {
            if (employee.getTabNum() == tabNumber) {
                return employee;
            }
        }
        throw new TabNumberException("Сотрудника с таким табельным номером не существует");
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Employee employee : employees) {
            res.append(employee);
        }
        return res.toString();
    }
}
