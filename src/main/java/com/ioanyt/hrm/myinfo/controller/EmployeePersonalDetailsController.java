package com.ioanyt.hrm.myinfo.controller;

import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import com.ioanyt.hrm.myinfo.service.EmployeePersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeePersonalDetailsController {

    private EmployeePersonalDetailsService employeePersonalDetailsService;

    @Autowired
    public EmployeePersonalDetailsController(EmployeePersonalDetailsService employeePersonalDetailsService) {
        this.employeePersonalDetailsService = employeePersonalDetailsService;
    }

    @PostMapping("/createEmployee")
    private EmployeePersonalDetails createEmployee(@RequestBody EmployeePersonalDetails personalDetails){
       return employeePersonalDetailsService.createEmployee(personalDetails);
    }

    @PutMapping("/updateEmployee")
    private EmployeePersonalDetails updateEmployee(@RequestBody EmployeePersonalDetails details, @RequestParam String empId){
        return employeePersonalDetailsService.updateEmployee(details, empId);
    }

    @GetMapping("/getAllEmployee")
    private Map<String, Object> getAllEmployee(){
        return employeePersonalDetailsService.getAllEmployee();
    }

    @GetMapping("/getAllPermanentEmployee")
    private Map<String, Object> getAllPermanentEmployee(){
        return employeePersonalDetailsService.getAllPermanentEmployee();
    }

    @GetMapping("/getAllProbationEmployee")
    private Map<String, Object> getAllProbationEmployee(){
        return employeePersonalDetailsService.getAllProbationEmployee();
    }

    @GetMapping("/getAllFormerEmployee")
    private Map<String, Object> getAllFormerEmployee(){
        return employeePersonalDetailsService.getAllFormerEmployee();
    }

    @GetMapping("/getAllInternEmployee")
    private Map<String, Object> getAllInternEmployee(){ return employeePersonalDetailsService.getAllInternEmployee();}

    @GetMapping("/getEmployeeByEmpId/{empId}")
    private EmployeePersonalDetails getEmployeeByEmpId(@PathVariable String empId){
        return employeePersonalDetailsService.getEmployeeByEmpId(empId);
    }

}
