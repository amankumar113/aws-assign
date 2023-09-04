package com.example.Aws.Assignment;

import com.example.Aws.Assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AwsAssignmentApplication {

	@Autowired
	private final EmployeeService employeeService;

	public AwsAssignmentApplication(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsAssignmentApplication.class, args);
	}

	@PostConstruct
	public void saveStudentOnStartup() {
		employeeService.SaveStudent();
	}

}
