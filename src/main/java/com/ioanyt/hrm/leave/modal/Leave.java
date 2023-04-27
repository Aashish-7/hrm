package com.ioanyt.hrm.leave.modal;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import com.ioanyt.hrm.leave.enums.LeaveStatus;
import com.ioanyt.hrm.leave.enums.LeaveType;
import com.ioanyt.hrm.myinfo.modal.EmployeePersonalDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("leave")
public class Leave {

    @Id
    private String leaveId = UUID.randomUUID().toString();
    private LeaveType leaveType;
    private LeavePeriod leavePeriod;
    private String comments;
    private LeaveStatus leaveStatus;
    @DBRef
    private EmployeePersonalDetails employeePersonalDetails;
}
