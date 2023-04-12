package com.ioanyt.hrm.myinfo.modal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeContactDetails {

    private String street;
    private String city;
    private String state;
    private String country;
    private String email;
    private String pinCode;
    private Long mobileNumber;
    private Long emergencyMobileNumber;
}
