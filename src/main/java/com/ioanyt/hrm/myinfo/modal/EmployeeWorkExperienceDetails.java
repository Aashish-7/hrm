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
public class EmployeeWorkExperienceDetails {

    private String companyName;
    private String jobTitle;
    private Date from;
    private Date to;
    private String comment;
}
