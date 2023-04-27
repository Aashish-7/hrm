package com.ioanyt.hrm.leave.dao;

import com.ioanyt.hrm.leave.modal.Leave;
import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends MongoRepository<Leave, String> {

    Leave findByLeaveId(String id);

    List<Leave> findByEmployeePersonalDetails(EmployeePersonalDetails employeeId);
}
