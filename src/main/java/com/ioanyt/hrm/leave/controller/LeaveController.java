package com.ioanyt.hrm.leave.controller;

import com.ioanyt.hrm.leave.dto.LeaveDto;
import com.ioanyt.hrm.leave.modal.Leave;
import com.ioanyt.hrm.leave.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeaveController {

    private LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping("/addLeave")
    public List<Leave> addLeave(@RequestBody LeaveDto leaveDto){
        return leaveService.addLeave(leaveDto);
    }
}
