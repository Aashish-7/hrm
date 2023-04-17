package com.ioanyt.hrm.myinfo.controller;

import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import com.ioanyt.hrm.myinfo.service.EmployeePersonalDetailsService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeePersonalDetailsGraphQlController {

    private EmployeePersonalDetailsService employeePersonalDetailsService;


    public EmployeePersonalDetailsGraphQlController(EmployeePersonalDetailsService employeePersonalDetailsService) {
        this.employeePersonalDetailsService = employeePersonalDetailsService;
    }

    @SchemaMapping(typeName = "Query", value = "findAll")
    public List<EmployeePersonalDetails> findAll(){
        return employeePersonalDetailsService.findAll();
    }

    @SchemaMapping(typeName = "Query",value = "getEmployeeByEmpId")
    public EmployeePersonalDetails getEmployeeByEmpId(@Argument String id){
        return employeePersonalDetailsService.getEmployeeByEmpId(id);
    }
}
