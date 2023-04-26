package com.ioanyt.hrm.leave.controller;

import com.ioanyt.hrm.leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    private LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }
}
