package com.ioanyt.hrm.leave.service;

import com.ioanyt.hrm.leave.dao.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    private LeaveRepository leaveRepository;

    @Autowired
    public LeaveService(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }
}
