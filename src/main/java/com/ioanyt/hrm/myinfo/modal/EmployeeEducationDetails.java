package com.ioanyt.hrm.myinfo.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEducationDetails {

    private String educationLevel;
    private String institute;
    private Date startDate;
    private Date endDate;
    private String specialization;
}
