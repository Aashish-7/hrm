package com.ioanyt.hrm.projects.dao;

import com.ioanyt.hrm.projects.modal.ProjectDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectDetailsRepository extends MongoRepository<ProjectDetails, UUID> {

    ProjectDetails findByProjectID(UUID projectId);
}
