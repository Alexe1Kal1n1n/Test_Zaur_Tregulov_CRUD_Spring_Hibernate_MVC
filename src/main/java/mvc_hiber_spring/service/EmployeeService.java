package mvc_hiber_spring.service;

import mvc_hiber_spring.entity.Employee;

import java.util.List;

public interface EmployeeService  {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
