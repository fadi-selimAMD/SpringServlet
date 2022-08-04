package com.springservlet.springservlet.service;

import com.springservlet.springservlet.entity.Patient;
import com.springservlet.springservlet.repository.PatientRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Validated
public class PatientService {

    private final PatientRepo patientRepo;



    public Patient retrievePatientInfo(@NotNull @Positive Integer patientId,
                                           @NotBlank String accountNumber) throws NotFoundException {
        log.info("retrieveTempPatient service from local db with patientId : " + patientId + " and accountNumber :" + accountNumber);
        Optional<Patient> tempPatient = patientRepo.findTempPatientByPidAndAccountNumber(patientId, accountNumber);


        if (!tempPatient.isPresent()) {
            log.info("TempPatient with patientId : " + patientId + " and accountNumber :" + accountNumber + " Not Found");
            throw new NotFoundException("Temporary Patient Not Found");
        }
        return tempPatient.get();
    }
}
