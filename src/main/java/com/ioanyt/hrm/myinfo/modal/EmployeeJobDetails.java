package com.ioanyt.hrm.myinfo.modal;

import com.ioanyt.hrm.myinfo.enums.JobStatus;
import lombok.*;

import java.util.Date;
import java.util.Enumeration;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeJobDetails {

    private Date joiningDate;
    private String jobTitle;
    private String jobCategory;
    private String jobLocation;
    private JobStatus jobStatus;
    private String designation;
}
