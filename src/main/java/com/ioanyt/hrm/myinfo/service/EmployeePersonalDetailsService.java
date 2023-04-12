package com.ioanyt.hrm.myinfo.service;

import com.ioanyt.hrm.myinfo.dao.EmployeePersonalDetailsRepository;
import com.ioanyt.hrm.myinfo.enums.JobStatus;
import com.ioanyt.hrm.myinfo.modal.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class EmployeePersonalDetailsService {

    private final EmployeePersonalDetailsRepository employeePersonalDetailsRepository;

    @Autowired
    public EmployeePersonalDetailsService(EmployeePersonalDetailsRepository employeePersonalDetailsRepository) {
        this.employeePersonalDetailsRepository = employeePersonalDetailsRepository;
    }

    public EmployeePersonalDetails createEmployee(EmployeePersonalDetails personalDetails) {
        EmployeePersonalDetails employeePersonalDetails = new EmployeePersonalDetails();
        employeePersonalDetails.setFirstName(personalDetails.getFirstName());
        employeePersonalDetails.setMiddleName(personalDetails.getMiddleName());
        employeePersonalDetails.setLastName(personalDetails.getLastName());
        employeePersonalDetails.setEmpId(personalDetails.getEmpId());
        employeePersonalDetails.setNationality(personalDetails.getNationality());
        employeePersonalDetails.setMaritalStatus(personalDetails.getMaritalStatus());
        employeePersonalDetails.setGender(personalDetails.getGender());
        employeePersonalDetails.setDateOfBirth(personalDetails.getDateOfBirth());
        employeePersonalDetails.setEmployeeContactDetails(personalDetails.getEmployeeContactDetails());
        employeePersonalDetails.setEmployeeQualificationDetails(personalDetails.getEmployeeQualificationDetails());
        employeePersonalDetails.setEmployeeJobDetails(personalDetails.getEmployeeJobDetails());
        employeePersonalDetailsRepository.save(employeePersonalDetails);
        return employeePersonalDetails;
    }

    public EmployeePersonalDetails updateEmployee(EmployeePersonalDetails details, String empId) {
        EmployeePersonalDetails employeePersonalDetails = employeePersonalDetailsRepository.findByEmpId(empId);

        if (details.getFirstName() != null && !details.getFirstName().isEmpty()) {
            employeePersonalDetails.setFirstName(details.getFirstName());
        }
        if (details.getMiddleName() != null && !details.getMiddleName().isEmpty()) {
            employeePersonalDetails.setMiddleName(details.getMiddleName());
        }
        if (details.getLastName() != null && !details.getLastName().isEmpty()) {
            employeePersonalDetails.setLastName(details.getLastName());
        }
        if (details.getEmpId() != null) {
            employeePersonalDetails.setEmpId(details.getEmpId());
        }
        if (details.getNationality() != null && !details.getNationality().isEmpty()) {
            employeePersonalDetails.setNationality(details.getNationality());
        }
        if (details.getMaritalStatus() != null && !details.getMaritalStatus().isEmpty()) {
            employeePersonalDetails.setMaritalStatus(details.getMaritalStatus());
        }
        if (details.getGender() != null && !details.getGender().isEmpty()) {
            employeePersonalDetails.setGender(details.getGender());
        }
        if (details.getDateOfBirth() != null && (details.getDateOfBirth() instanceof Date)) {
            employeePersonalDetails.setDateOfBirth(details.getDateOfBirth());
        }
        updateEmployeeContactDetails(details.getEmployeeContactDetails(), employeePersonalDetails);
        employeePersonalDetails.setEmployeeQualificationDetails(details.getEmployeeQualificationDetails());
        employeePersonalDetails.setEmployeeJobDetails(details.getEmployeeJobDetails());
        employeePersonalDetailsRepository.save(employeePersonalDetails);
        return employeePersonalDetails;
    }

    private void updateEmployeeContactDetails(EmployeeContactDetails employeeContactDetails, EmployeePersonalDetails employeePersonalDetails) {
        if (employeeContactDetails.getPinCode() != null && !employeeContactDetails.getPinCode().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setPinCode(employeeContactDetails.getPinCode());
        }
        if (employeeContactDetails.getStreet() != null && !employeeContactDetails.getStreet().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setStreet(employeeContactDetails.getStreet());
        }
        if (employeeContactDetails.getCity() != null && !employeeContactDetails.getCity().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setCity(employeeContactDetails.getCity());
        }
        if (employeeContactDetails.getState() != null && !employeeContactDetails.getState().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setState(employeeContactDetails.getState());
        }
        if (employeeContactDetails.getCountry() != null && !employeeContactDetails.getCountry().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setCountry(employeeContactDetails.getCountry());
        }
        if (employeeContactDetails.getEmail() != null && !employeeContactDetails.getEmail().isEmpty()) {
            employeePersonalDetails.getEmployeeContactDetails().setEmail(employeeContactDetails.getEmail());
        }
        if (employeeContactDetails.getMobileNumber() != null && employeeContactDetails.getMobileNumber() instanceof Long) {
            employeePersonalDetails.getEmployeeContactDetails().setMobileNumber(employeeContactDetails.getMobileNumber());
        }
        if (employeeContactDetails.getEmergencyMobileNumber() != null && employeeContactDetails.getEmergencyMobileNumber() instanceof Long) {
            employeePersonalDetails.getEmployeeContactDetails().setEmergencyMobileNumber(employeeContactDetails.getEmergencyMobileNumber());
        }
    }

    private void updateEmployeeQualificationDetails(EmployeeQualificationDetails employeeQualificationDetails, EmployeePersonalDetails employeePersonalDetails) {
    }

    private void updateEmployeeJobDetails(EmployeeJobDetails employeeJobDetails, EmployeePersonalDetails employeePersonalDetails) {
    }

    public Map<String, Object> getAllEmployee() {
        Map<String, Object> personalDetailsLongMap = new HashMap<>();
        personalDetailsLongMap.put("Count", employeePersonalDetailsRepository.count());
        personalDetailsLongMap.put("Data", employeePersonalDetailsRepository.findAll());
        return personalDetailsLongMap;
    }

    public Map<String, Object> getAllPermanentEmployee() {
        Map<String, Object> map = new HashMap<>();
        map.put("Count", employeePersonalDetailsRepository.countAllByEmployeeJobDetails_JobStatus(JobStatus.PERMANENT));
        map.put("Data", employeePersonalDetailsRepository.findAllByEmployeeJobDetails_JobStatus(JobStatus.PERMANENT));
        return map;
    }

    public Map<String, Object> getAllProbationEmployee() {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("Count", employeePersonalDetailsRepository.countAllByEmployeeJobDetails_JobStatus(JobStatus.PROBATION));
        objectMap.put("Data", employeePersonalDetailsRepository.findAllByEmployeeJobDetails_JobStatus(JobStatus.PROBATION));
        return objectMap;
    }

    public Map<String, Object> getAllFormerEmployee() {
        Map<String, Object> objectMapFormer = new HashMap<>();
        objectMapFormer.put("Count", employeePersonalDetailsRepository.countAllByEmployeeJobDetails_JobStatus(JobStatus.FORMER));
        objectMapFormer.put("Data", employeePersonalDetailsRepository.findAllByEmployeeJobDetails_JobStatus(JobStatus.FORMER));
        return objectMapFormer;
    }

    public Map<String, Object> getAllInternEmployee() {
        Map<String, Object> objectMapFormer = new HashMap<>();
        objectMapFormer.put("Count", employeePersonalDetailsRepository.countAllByEmployeeJobDetails_JobStatus(JobStatus.INTERNSHIP));
        objectMapFormer.put("Data", employeePersonalDetailsRepository.findAllByEmployeeJobDetails_JobStatus(JobStatus.INTERNSHIP));
        return objectMapFormer;
    }


    public EmployeePersonalDetails getEmployeeByEmpId(String empId) {
        return employeePersonalDetailsRepository.findByEmpId(empId);
    }
}
