package com.example.restApi.Service;

import com.example.restApi.Repository.EmployeeRepository;
import com.example.restApi.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Employee addEmployee(Employee employee, MultipartFile image){
        if(employeeRepository.findByEmail(employee.getEmail()) != null){
            throw new RuntimeException("Employee with this email is already registered");
        }
        if(employeeRepository.findByPhone(employee.getPhone()) != null){
            throw new RuntimeException("Employee with same no already registered");
        }

        if(image != null && image.isEmpty()){
            String filename= StringUtils.cleanPath(image.getOriginalFilename());
            try{
                employee.setImage(image.getBytes());
            }catch(IOException e){
                throw new RuntimeException("Failed To store image "+ e.getMessage());
            }
        }
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
