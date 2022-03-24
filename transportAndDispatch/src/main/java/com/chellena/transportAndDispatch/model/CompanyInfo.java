package com.chellena.transportAndDispatch.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static com.chellena.transportAndDispatch.constant.DBColumns.COMPANY_ID;

@Data
@Entity(name="COMPANY_INFO")
@NoArgsConstructor

public class CompanyInfo {
    @Id
    @Column( name=COMPANY_ID)
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int customerId;
    @Column(name = "COMPANY_NAME")
    @NotNull (message ="Value cannot be null")
    private String companyName;
    @Column(name = "CONTACT_PERSON")
    @NotNull (message ="Value cannot be null")
    private String ContactPerson;
    @Column(name = "STREET_ADDRESS")
    @NotNull (message ="Value cannot be null")
    private String streetAddress;
    @Column(name = "CITY")
    @NotNull (message ="Value cannot be null")
    private String city;
    @Column(name = "STATE")
    @NotNull (message ="Value cannot be null")
    private String state;
    @Column(name = "ZIPCODE")
    @NotNull (message ="Value cannot be null")
    private String zipcode;
    @Column(name = "EMAIL_ADDRESS")
    @NotNull (message ="Value cannot be null")
    private String emailAddress;
    @Column(name = "PHONE_NUMBER")
    @NotNull (message ="Value cannot be null")
    private String phoneNumber;
}
