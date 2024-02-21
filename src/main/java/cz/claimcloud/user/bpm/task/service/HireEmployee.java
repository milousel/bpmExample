package cz.claimcloud.user.bpm.task.service;

import cz.claimcloud.user.model.entity.Employee;
import cz.claimcloud.user.service.EmployeeService;
import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
@RequiredArgsConstructor
public class HireEmployee implements JavaDelegate {

    private final EmployeeService employeeService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        // throw new Exception("test err");

        String firstName = (String) delegateExecution.getVariable("firstName");
        String lastName = (String) delegateExecution.getVariable("lastName");
        int salary = (int) delegateExecution.getVariable("salary");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSalary(salary);

        employeeService.saveEmployee(employee);


    }
}