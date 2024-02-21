package cz.claimcloud.user.service.impl;


import cz.claimcloud.user.model.entity.Employee;
import cz.claimcloud.user.repository.EmployeeRepository;
import cz.claimcloud.user.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public List<Employee> getEmployeeBySalaryGreaterThan(Integer salary) {
        return repository.findBySalaryGreaterThan(salary);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void dropEmployee(Integer id) {
        repository.deleteById(id);
    }

    public void streamTest() {
        // 1. sort
        Stream<String> employees = getAllEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).map(e -> (e.getFirstName() + " " + e.getLastName() + " " + e.getSalary()));
        employees.forEach(System.out::println);
        // 2. max
        Employee highestSalaryEmp = getAllEmployees().stream().max(Comparator.comparing(Employee::getSalary)).orElse(new Employee());
        log.info("Employee with the highest salary is {}", highestSalaryEmp);
        //3. drop Arnold
        Stream<Employee> dropArnold = getAllEmployees().stream().filter(e -> e.getFirstName().contains("Arnold"));
        dropArnold.forEach(employee -> log.info(employee.toString()));
        //4. get employees names
        Stream<String> empList = getAllEmployees().stream().map(e -> (e.getFirstName() + " " + e.getLastName()));
        empList.forEach(System.out::println);
    }
}
