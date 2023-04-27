package com.ioanyt.hrm.leave.service;

import com.ioanyt.hrm.leave.dao.LeaveRepository;
import com.ioanyt.hrm.leave.dto.LeaveDto;
import com.ioanyt.hrm.leave.enums.LeaveStatus;
import com.ioanyt.hrm.leave.enums.LeaveType;
import com.ioanyt.hrm.leave.modal.Leave;
import com.ioanyt.hrm.myinfo.dao.EmployeePersonalDetailsRepository;
import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    private final LeaveRepository leaveRepository;

    private final EmployeePersonalDetailsRepository employeePersonalDetailsRepository;

    @Autowired
    public LeaveService(LeaveRepository leaveRepository, EmployeePersonalDetailsRepository employeePersonalDetailsRepository) {
        this.leaveRepository = leaveRepository;
        this.employeePersonalDetailsRepository = employeePersonalDetailsRepository;
    }

    public Leave applyLeave(LeaveDto leaveDto){
        Leave leave = new Leave();

        leaveRepository.save(leave);
        return leave;
    }

    public List<Leave> addLeave(LeaveDto leaveDto){
        EmployeePersonalDetails employeePersonalDetails = employeePersonalDetailsRepository.findByEmpId(leaveDto.getEmployeeId());
        createLeave(leaveDto, employeePersonalDetails);
        return leaveRepository.findByEmployeePersonalDetails(employeePersonalDetails);
    }

    public void createLeave(LeaveDto leaveDto, EmployeePersonalDetails employeePersonalDetails){

        for (int i = 0; i < leaveDto.getCasualLeave(); i++) {
            Leave leave = new Leave();
            leave.setLeaveType(LeaveType.CASUAL_LEAVE);
            leave.setLeaveStatus(LeaveStatus.AVAILABLE);
            leave.setLeavePeriod(leaveDto.getLeavePeriod());
            leave.setEmployeePersonalDetails(employeePersonalDetails);
            leaveRepository.save(leave);
        }
        for (int i = 0; i < leaveDto.getNegativeLeave(); i++) {
            Leave leave = new Leave();
            leave.setLeaveType(LeaveType.NEGATIVE_LEAVE);
            leave.setLeaveStatus(LeaveStatus.AVAILABLE);
            leave.setLeavePeriod(leaveDto.getLeavePeriod());
            leave.setEmployeePersonalDetails(employeePersonalDetails);
            leaveRepository.save(leave);
        }
        for (int i = 0; i < leaveDto.getSickLeave(); i++) {
            Leave leave = new Leave();
            leave.setLeaveType(LeaveType.SICK_LEAVE);
            leave.setLeaveStatus(LeaveStatus.AVAILABLE);
            leave.setLeavePeriod(leaveDto.getLeavePeriod());
            leave.setEmployeePersonalDetails(employeePersonalDetails);
            leaveRepository.save(leave);
        }
        for (int i = 0; i < leaveDto.getPaidLeave(); i++) {
            Leave leave = new Leave();
            leave.setLeaveType(LeaveType.PAID_LEAVE);
            leave.setLeaveStatus(LeaveStatus.AVAILABLE);
            leave.setLeavePeriod(leaveDto.getLeavePeriod());
            leave.setEmployeePersonalDetails(employeePersonalDetails);
            leaveRepository.save(leave);
        }
    }
}
