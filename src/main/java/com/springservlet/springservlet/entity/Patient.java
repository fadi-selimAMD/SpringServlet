package com.springservlet.springservlet.entity;
import com.springservlet.springservlet.entity.enums.SmokingStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    @Id
    @Column(name = "tempPatientId")
    private String tempPatientId;

    @Column(name = "pid")
    private Integer pid;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "dateOfBirth")
    private Long dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "homePhone")
    private String homePhone;

    @Column(name = "cellPhone")
    private String cellPhone;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "street")
    private String street;

    @Column(name = "street2")
    private String street2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "socialSecurity")
    private String socialSecurity;

    @Column(name = "race")
    private String race;

    @Column(name = "ethnicity")
    private String ethnicity;

    @Column(name = "emergencyContact")
    private String emergencyContact;

    @Column(name = "emergencyPhone")
    private String emergencyPhone;


    @Column(name = "language")
    private String language;

    @Enumerated(EnumType.STRING)
    @Column(name = "smokingStatus")
    private SmokingStatusEnum smokingStatus;

    @Column(name = "referrerId")
    private Integer referrerId;

    @Column(name = "primaryCareId")
    private Integer primaryCareId;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "lastUpdateDate")
    private Long lastUpdateDate;
    @Column(name = "referrerfname")
    private String referrerfname;

    @Column(name = "referrerlname")
    private String referrerlname;

    @Column(name = "primaryCarefname")
    private String primaryCarefname;

    @Column(name = "primaryCarelname")
    private String primaryCarelname;
}
