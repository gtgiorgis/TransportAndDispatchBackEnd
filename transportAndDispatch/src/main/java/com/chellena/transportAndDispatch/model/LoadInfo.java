package com.chellena.transportAndDispatch.model;

import javax.persistence.*;
import java.util.Date;
@Entity(name= "LOAD_INFO")

public class LoadInfo {


    @Id
    @Column(name = "LOAD_INFO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loadInfoId;
    private String companyName;
    private String contactPerson;
    private String loadType;
    private double weight;
    private String pickFrom;
    private String deliverTo;
    private String description;
    private String truckType;
    private String truckNumber;

    public void loadInfo ( int loadInfoId,
    String companyName,
    String contactPerson,
    String loadType,
    double weight,
    String pickFrom,
    String deliverTo,
    String description,
    String truckType,
    String truckNumber)
    {
        this.loadInfoId =loadInfoId ;
                this.companyName =companyName;
                this.contactPerson =contactPerson;
                this.loadType = loadType;
                this.weight = weight;
                this.pickFrom = pickFrom;
                this.deliverTo = deliverTo;
                this.description=description;
                this.truckType= truckType;
                this.truckNumber= truckNumber;
    }

    public int getLoadInfoId() {
        return loadInfoId;
    }

    public void setLoadInfoId(int loadInfoId) {
        this.loadInfoId = loadInfoId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPickFrom() {
        return pickFrom;
    }

    public void setPickFrom(String pickFrom) {
        this.pickFrom = pickFrom;
    }

    public String getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(String deliverTo) {
        this.deliverTo = deliverTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

}
