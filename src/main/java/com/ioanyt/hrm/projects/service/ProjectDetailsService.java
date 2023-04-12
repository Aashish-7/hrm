package com.ioanyt.hrm.projects.service;

import com.ioanyt.hrm.myinfo.dao.EmployeePersonalDetailsRepository;
import com.ioanyt.hrm.projects.dao.ProjectDetailsRepository;
import com.ioanyt.hrm.projects.dto.ProjectDetailsDto;
import com.ioanyt.hrm.projects.modal.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectDetailsService {

    private final ProjectDetailsRepository projectDetailsRepository;

    private final EmployeePersonalDetailsRepository employeePersonalDetailsRepository;

    @Autowired
    public ProjectDetailsService(ProjectDetailsRepository projectDetailsRepository, EmployeePersonalDetailsRepository employeePersonalDetailsRepository) {
        this.projectDetailsRepository = projectDetailsRepository;
        this.employeePersonalDetailsRepository = employeePersonalDetailsRepository;
    }

    public ProjectDetails createProject(ProjectDetailsDto projectDetailsDto){
        ProjectDetails projectDetails = new ProjectDetails();
        projectDetails.setProjectName(projectDetailsDto.getProjectName());
        projectDetails.setProjectManager(employeePersonalDetailsRepository.findByEmpId(projectDetailsDto.getProjectManagerEmpId()));
        projectDetails.setCreateDate(projectDetailsDto.getCreateDate());
        projectDetails.setProjectDescription(projectDetailsDto.getProjectDescription());
        projectDetails.setCategory(projectDetailsDto.getCategory());
        projectDetails.setProjectStatus(projectDetailsDto.getProjectStatus());
        projectDetails.setProjectMembers(employeePersonalDetailsRepository.findAllByEmpIdIn(projectDetailsDto.getEmpId()));
        projectDetailsRepository.save(projectDetails);
        return projectDetails;
    }

    public ProjectDetails updateProject(ProjectDetailsDto detailsDto, UUID projectId){
        ProjectDetails details = projectDetailsRepository.findByProjectID(projectId);
        details.setProjectName(detailsDto.getProjectName());
        details.setProjectManager(employeePersonalDetailsRepository.findByEmpId(detailsDto.getProjectManagerEmpId()));
        details.setCreateDate(detailsDto.getCreateDate());
        details.setProjectDescription(detailsDto.getProjectDescription());
        details.setCategory(detailsDto.getCategory());
        details.setProjectStatus(detailsDto.getProjectStatus());
        details.setProjectMembers(employeePersonalDetailsRepository.findAllByEmpIdIn(detailsDto.getEmpId()));
        projectDetailsRepository.save(details);
        return details;
    }
}
