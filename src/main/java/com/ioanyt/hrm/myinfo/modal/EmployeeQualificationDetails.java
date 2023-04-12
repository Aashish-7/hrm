package com.ioanyt.hrm.myinfo.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeQualificationDetails {

    private List<String> skills;
    private List<String> languages;
    private List<EmployeeWorkExperienceDetails> employeeWorkExperienceDetails;
    private List<EmployeeEducationDetails> employeeEducationDetails;
}
