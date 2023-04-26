package com.ioanyt.hrm.leave.dao;

import com.ioanyt.hrm.leave.modal.Leave;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends MongoRepository<Leave, String> {
}
