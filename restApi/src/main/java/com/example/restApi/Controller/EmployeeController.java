package com.example.restApi.Controller;

import com.example.restApi.Service.EmployeeService;
import com.example.restApi.model.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@Valid @ModelAttribute Employee employee,
                                                @RequestParam("image")MultipartFile image){
        Employee savedEmployee = employeeService.addEmployee(employee ,image);
        return new ResponseEntity<>(savedEmployee , HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }
}
