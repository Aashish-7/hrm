package com.ioanyt.hrm.projects.controller;

import com.ioanyt.hrm.projects.dto.ProjectDetailsDto;
import com.ioanyt.hrm.projects.modal.ProjectDetails;
import com.ioanyt.hrm.projects.service.ProjectDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ProjectDetailsController {

    private ProjectDetailsService projectDetailsService;

    @Autowired
    public ProjectDetailsController(ProjectDetailsService projectDetailsService) {
        this.projectDetailsService = projectDetailsService;
    }

    @PostMapping("/createProject")
    public ProjectDetails createProject(@RequestBody ProjectDetailsDto projectDetailsDto){
        return projectDetailsService.createProject(projectDetailsDto);
    }

    @PutMapping("/updateProject/{projectId}")
    public ProjectDetails updateProject(@RequestBody ProjectDetailsDto detailsDto, @PathVariable UUID projectId){
        return projectDetailsService.updateProject(detailsDto, projectId);
    }
}
