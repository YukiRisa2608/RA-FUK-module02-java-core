package bai02_employee.Implement;

import bai02_employee.ClassModalEmployee.Employee;
import bai02_employee.Interface.ICrud;

import java.util.ArrayList;
import java.util.List;

public class ImplementCrud implements ICrud<Employee, Integer> {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void create(Employee employee) {
    employees.add(employee);
    }

    @Override
    public Employee read(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void update(Employee updateEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == updateEmployee.getId()) {
                employees.set(i, updateEmployee);
                break;
            }
        }
    }

    @Override
    public void delete(Integer id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    @Override
    public int getIndexOf(Integer id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Employee> finfAll() {
        return employees;
    }

    @Override
    public int getSize() {
        return employees.size();
    }
}
