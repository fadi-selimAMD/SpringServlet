package com.springservlet.springservlet.repository;
import com.springservlet.springservlet.entity.Patient;
import org.apache.ibatis.annotations.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Optional;

@Mapper
public interface PatientRepo {

    @Select("SELECT * FROM temppatient WHERE pid = #{pid} and accountNumber= #{accountNumber}")
    Optional<Patient> findTempPatientByPidAndAccountNumber(@NotNull @Positive @Param("pid") Integer pid,
                                                           @Param("accountNumber") @NotBlank String accountNumber);


    @Select("SELECT * FROM temppatient WHERE tempPatientId = #{tempPatientId}")
    Optional<Patient> findTempPatientByTempPatientId(@Param("tempPatientId") String tempPatientId);

    @Insert("INSERT INTO temppatient (tempPatientId,pid,fname,lname,dateOfBirth,gender," +
            "emailAddress,homePhone,cellPhone,zipCode,street,street2,city,state," +
            "race,ethnicity, emergencyContact,emergencyPhone,maritalStatus,employmentStatus,smokingStatus,language," +
            "referrerId,primaryCareId,accountNumber , lastUpdateDate ,referrerfname,referrerlname,primaryCarefname,primaryCarelname) VALUES" +
            " (#{tempPatient.tempPatientId},#{tempPatient.pid},#{tempPatient.fname},#{tempPatient.lname},#{tempPatient.dateOfBirth}," +
            "#{tempPatient.gender},#{tempPatient.emailAddress},#{tempPatient.homePhone}" +
            ",#{tempPatient.cellPhone},#{tempPatient.zipCode},#{tempPatient.street},#{tempPatient.street2},#{tempPatient.city}," +
            "#{tempPatient.state}" +
            ",#{tempPatient.race},#{tempPatient.ethnicity},#{tempPatient.emergencyContact},#{tempPatient.emergencyPhone}," +
            "#{tempPatient.maritalStatus}" +
            ",#{tempPatient.employmentStatus},#{tempPatient.smokingStatus},#{tempPatient.language}," +
            "#{tempPatient.referrerId},#{tempPatient.primaryCareId},#{tempPatient.accountNumber} , #{tempPatient.lastUpdateDate}" +
            ", #{tempPatient.referrerfname}, #{tempPatient.referrerlname}, #{tempPatient.primaryCarefname}, #{tempPatient.primaryCarelname})")
    void createTempPatient(@Valid @NotNull @Param("tempPatient") Patient patient);

    @Update("UPDATE temppatient SET " +
            "fname = #{tempPatient.fname}," +
            "lname = #{tempPatient.lname}," +
            "dateOfBirth = #{tempPatient.dateOfBirth}," +
            "gender = #{tempPatient.gender}," +
            "emailAddress = #{tempPatient.emailAddress}," +
            "homePhone = #{tempPatient.homePhone}," +
            "cellPhone = #{tempPatient.cellPhone}," +
            "zipCode = #{tempPatient.zipCode}," +
            "street = #{tempPatient.street}," +
            "street2 = #{tempPatient.street2}," +
            "city = #{tempPatient.city}," +
            "state = #{tempPatient.state}," +
            "race = #{tempPatient.race}," +
            "ethnicity = #{tempPatient.ethnicity}," +
            " emergencyContact =#{tempPatient.emergencyContact}," +
            "emergencyPhone = #{tempPatient.emergencyPhone}," +
            "maritalStatus = #{tempPatient.maritalStatus}," +
            "employmentStatus = #{tempPatient.employmentStatus}," +
            "smokingStatus = #{tempPatient.smokingStatus}," +
            "language = #{tempPatient.language}," +
            "referrerId = #{tempPatient.referrerId}," +
            "primaryCareId = #{tempPatient.primaryCareId}," +
            "accountNumber = #{tempPatient.accountNumber} ," +
            "lastUpdateDate = #{tempPatient.lastUpdateDate} ," +
            "referrerfname = #{tempPatient.referrerfname}, " +
            "referrerlname = #{tempPatient.referrerlname}, " +
            "primaryCarefname = #{tempPatient.primaryCarefname}, " +
            "primaryCarelname = #{tempPatient.primaryCarelname} " +
            " WHERE pid = #{tempPatient.pid}")
    void updateTempPatient(@Valid @NotNull @Param("tempPatient") Patient patient);
}
