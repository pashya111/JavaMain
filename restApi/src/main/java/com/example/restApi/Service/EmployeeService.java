package com.example.restApi.Service;

import com.example.restApi.model.Employee;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee, MultipartFile image);
    List<Employee> getAllEmployees();
}
