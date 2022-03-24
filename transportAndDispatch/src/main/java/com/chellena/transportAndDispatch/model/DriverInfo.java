package com.chellena.transportAndDispatch.model;

import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static com.chellena.transportAndDispatch.constant.DBTables.CUSTOMER_INFO;
import static com.chellena.transportAndDispatch.constant.DBTables.DRIVER_INFO;

@Data
@Entity(name = DRIVER_INFO)
@AllArgsConstructor
@NoArgsConstructor
public class DriverInfo {
    @Id
    @Column(name = "DRIVER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    @Column(name = "FIRST_NAME")
    @NotNull(message = "Name cannot be null")
    private String firstname;
    @Column(name = "LAST_NAME")
    @NotNull(message = "Last name cannot be null")
    private String lastName;
    @Column(name = "STREET_ADDRESS")
    @NotNull(message = "NAddress cannot be null")
    private String streetAddress;
    @Column(name = "CITY")
    @NotNull(message = " City cannot be null")
    private String city;
    @Column(name = "STATE")
    @NotNull(message = "State  cannot be null")
    private String state;
    @Column(name = "ZIPCODE")
    @NotNull(message = "Zipcode cannot be null")
    private String zipcode;
    @Column(name = "EMAIL_ADDRESS")
    @NotNull(message = "Email address cannot be null")
    private String emailAddress;
    @Column(name = "PHONE_NUMBER")
    @NotNull(message = "Phone number cannot be null")
    private String phoneNumber;
    @Column(name = "IS_ACTIVE")
    @NotNull(message = "Phone number cannot be null")
    private boolean isActive;

}