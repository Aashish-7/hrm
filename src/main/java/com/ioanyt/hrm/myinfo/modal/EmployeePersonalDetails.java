package com.ioanyt.hrm.myinfo.modal;

import com.ioanyt.hrm.leave.modal.Leave;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("employee")
public class EmployeePersonalDetails {

    @Id
    private String uuid = UUID.randomUUID().toString();
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
