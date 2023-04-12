package com.ioanyt.hrm.myinfo.dao;

import com.ioanyt.hrm.myinfo.enums.JobStatus;
import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeePersonalDetailsRepository extends MongoRepository<EmployeePersonalDetails, UUID> {

    EmployeePersonalDetails findByEmpId(String empId);
    List<EmployeePersonalDetails> findAllByEmployeeJobDetails_JobStatus(JobStatus jobStatus);
    Long countAllByEmployeeJobDetails_JobStatus(JobStatus jobStatus);

    List<EmployeePersonalDetails> findAllByEmpIdIn(List<String> empId);
}
