package com.ioanyt.hrm.projects.dto;

import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import com.ioanyt.hrm.projects.enums.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDetailsDto {

    private String projectName;
    private String projectManagerEmpId;
    private Date createDate;
    private String projectDescription;
    private String category;
    private ProjectStatus projectStatus;
    private List<String> empId;
}
