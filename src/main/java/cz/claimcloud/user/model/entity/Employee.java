package cz.claimcloud.user.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Entity(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    @Size(min = 3, message = "Name should have atleast 3 characters")
    @NotNull
    private String firstName;

    @Size(min = 3, message = "Name should have atleast 3 characters")
    @NotNull
    private String lastName;

    @Min(value = 15000, message = "Salary should be greater than 15000")
    @NotNull
    private int salary;
}
