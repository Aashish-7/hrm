package com.ioanyt.hrm.myinfo.dto;

import com.ioanyt.hrm.myinfo.modal.EmployeeContactDetails;
import com.ioanyt.hrm.myinfo.modal.EmployeeJobDetails;
import com.ioanyt.hrm.myinfo.modal.EmployeeQualificationDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
public class EmployeePersonalDetailDto {

    private String firstName;
    private String middleName;
    private String lastName;
    private String empId;
    private String nationality;
    private String maritalStatus;
    private Date dateOfBirth;
    private String gender;
    private EmployeeContactDetails employeeContactDetails;
    private EmployeeQualificationDetails employeeQualificationDetails;
    private EmployeeJobDetails employeeJobDetails;

}
