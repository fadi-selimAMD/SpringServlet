package com.springservlet.springservlet.controller;
import com.springservlet.springservlet.entity.Patient;
import com.springservlet.springservlet.service.PatientService;
import org.apache.ibatis.javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/getTempPatient")
    public ResponseEntity<Patient> getTempPatient(@RequestParam("patientId") @Positive Integer patientId) throws NotFoundException {
        log.info("retrieveTempPatient controller with patientId : " + patientId);
        Patient patient = patientService.retrievePatientInfo(patientId, "7613590");
        return ResponseEntity.ok(patient);
    }
}

