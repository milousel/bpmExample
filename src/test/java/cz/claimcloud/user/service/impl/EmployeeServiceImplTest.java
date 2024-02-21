package cz.claimcloud.user.service.impl;

import cz.claimcloud.user.model.entity.Employee;
import cz.claimcloud.user.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeServiceImpl service;
    private Employee employee;
    private int employeeId;

    @BeforeEach
    public void init() {
        employee = new Employee(1, "Adam", "Doubek", 32500);
        employeeId = 1;
    }

    @Test
    public void getAllEmployees() {
        when(repository.findAll()).thenReturn(Collections.singletonList(employee));
        List<Employee> savedEmployees = service.getAllEmployees();
        Assertions.assertThat(savedEmployees).isNotNull();
    }

    @Test
    public void getEmployeeById() {
        when(repository.findById(employeeId)).thenReturn(Optional.of(employee));
        Optional<Employee> savedEmployee = service.getEmployeeById(employeeId);
        Assertions.assertThat(savedEmployee).isNotNull();
    }

    @Test
    public void getEmployeeBySalaryGreaterThan() {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(new Employee(2, "Kamil", "Monitor", 35500));

        when(repository.findBySalaryGreaterThan(30000)).thenReturn(employees);
        List<Employee> savedEmployees = service.getEmployeeBySalaryGreaterThan(30000);
        Assertions.assertThat(savedEmployees.size()).isEqualTo(2);
    }

    @Test
    public void saveEmployee() {
        when(repository.save(Mockito.any(Employee.class))).thenReturn(employee);
        Employee savedEmp = service.saveEmployee(employee);
        Assertions.assertThat(savedEmp).isNotNull();
    }

    @Test
    public void dropEmployee() {
        Mockito.lenient().when(repository.findById(employeeId)).thenReturn(Optional.of(employee));
        assertAll(() -> service.dropEmployee(employeeId));
    }
}