package org.example;

import java.util.LinkedList;
import java.util.List;

public class EmployeeNote {

    private List<Employee> employees;

    public EmployeeNote(List<Employee> employees) {
        this.employees = employees;
        employees = new LinkedList<>();
    }

    public List<Employee> addNewEmployee(List<Employee> list, Employee employee){
        list.add(employee);
        return list;
    }

    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    public Employee searchByWorkExperience(List<Employee> list, int workExperience) throws WorkExperienceExceptions {
        for (Employee employee : list) {
            if (employee.getWorkExperience() >= workExperience){
                return employee;
            }
        }
        throw new WorkExperienceExceptions("Сотрудника с таким стажем не обнаружено");
    }

}
