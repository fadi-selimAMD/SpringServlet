package com.springservlet.springservlet.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum SmokingStatusEnum {
    Never_Smoker("Never smoker"),
    Current_Every_Day_Smoker("Current every day smoker"),
    Former_Smoker("Former smoker"),
    Heavy_Tobacco_Smoker("Heavy tobacco smoker"),
    Light_Tobacco_Smoker("Light tobacco smoker"),
    Current_Some_Day_Smoker("Current some day smoker"),
    Smoker_Current_Status_Unknown("Smoker, current status unknown"),
    Unknown_If_Ever_Smoked("Unknown if ever smoked");

    private String smokingStatusValue;

    SmokingStatusEnum(String smokingStatusValue) {
        this.smokingStatusValue = smokingStatusValue;
    }

    public String getSmokingStatusValue(){
        return this.smokingStatusValue;
    }

    @JsonCreator
    public static SmokingStatusEnum getSmokingStatusEnum(String value) {

        for (SmokingStatusEnum smokingStatusEnum : SmokingStatusEnum.values()) {

            if (smokingStatusEnum.getSmokingStatusValue().equals(value)) {

                return smokingStatusEnum;
            }
        }

        return null;
    }
}