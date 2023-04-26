package com.ioanyt.hrm.time.dao;

import com.ioanyt.hrm.time.modal.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends MongoRepository<Attendance, String> {
}
