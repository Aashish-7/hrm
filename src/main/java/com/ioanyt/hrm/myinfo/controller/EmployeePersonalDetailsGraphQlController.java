package com.ioanyt.hrm.myinfo.controller;

import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import com.ioanyt.hrm.myinfo.service.EmployeePersonalDetailsService;
import com.ioanyt.hrm.myinfo.dto.EmployeePersonalDetailDto;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeePersonalDetailsGraphQlController {

    private EmployeePersonalDetailsService employeePersonalDetailsService;


    public EmployeePersonalDetailsGraphQlController(EmployeePersonalDetailsService employeePersonalDetailsService) {
        this.employeePersonalDetailsService = employeePersonalDetailsService;
    }

    @QueryMapping
    public List<EmployeePersonalDetails> findAll(){
        return employeePersonalDetailsService.findAll();
    }

    @QueryMapping
    public EmployeePersonalDetails getEmployeeByEmpId(@Argument String id){
        return employeePersonalDetailsService.getEmployeeByEmpId(id);
    }

    @MutationMapping
    public EmployeePersonalDetails createEmployee(@Argument EmployeePersonalDetailDto employeePersonalDetails){
        return employeePersonalDetailsService.createEmployee(employeePersonalDetails);
    }
}
