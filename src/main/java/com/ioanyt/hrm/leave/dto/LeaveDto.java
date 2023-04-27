package com.ioanyt.hrm.leave.dto;

import com.ioanyt.hrm.leave.enums.LeaveType;
import com.ioanyt.hrm.leave.modal.LeavePeriod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LeaveDto {

    private String leaveId;
    private LeaveType leaveType;
    private LeavePeriod leavePeriod;
    private int leaveBalance;
    private String comments;
    private String employeeId;
    private Integer sickLeave;
    private Integer casualLeave;
    private Integer negativeLeave;
    private Integer paidLeave;
}
