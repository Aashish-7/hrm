package com.ioanyt.hrm.leave.dao;

import com.ioanyt.hrm.leave.modal.Holidays;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends MongoRepository<Holidays, Long> {
}
