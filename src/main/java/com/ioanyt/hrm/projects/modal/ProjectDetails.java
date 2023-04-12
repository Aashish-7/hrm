package com.ioanyt.hrm.projects.modal;

import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import com.ioanyt.hrm.projects.enums.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("project")
public class ProjectDetails {

    @Id
    private UUID projectID = UUID.randomUUID();
    private String projectName;
    @DBRef
    private EmployeePersonalDetails projectManager;
    private Date createDate;
    private String projectDescription;
    private String category;
    private ProjectStatus projectStatus;


    @DBRef
    private List<EmployeePersonalDetails> projectMembers;
}
