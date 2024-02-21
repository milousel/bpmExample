package cz.claimcloud.user.service;

import cz.claimcloud.user.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Integer id);

    List<Employee> getEmployeeBySalaryGreaterThan(Integer salary);

    Employee saveEmployee(Employee employee);

    void dropEmployee(Integer id);

    void streamTest();
}
