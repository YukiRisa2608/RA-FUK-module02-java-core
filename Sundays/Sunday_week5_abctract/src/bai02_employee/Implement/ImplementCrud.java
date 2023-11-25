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
    public boolean update(Employee updateEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == updateEmployee.getId()) {
                employees.set(i, updateEmployee);
                System.out.println("Updated employee successfully");
                return true;
            }
        }
        System.out.println("Not found employee");
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        boolean found = employees.removeIf(employee -> employee.getId() == id);
        if (found) {
            System.out.println("Deleting employee successfully");
        } else {
            System.out.println("Not found employee");
        }
        return found;
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
