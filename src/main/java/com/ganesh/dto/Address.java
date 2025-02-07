package com.ganesh.dto;

public class Address {
    private String street;
    private String villageName;
    private String district;
    private String state;
    private int pinCode;
    
    public Address() {
        
    }
    public Address(String street, String villageName, String district, String state, int pinCode) {
        this.street = street;
        this.villageName = villageName;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "[ " + this.getStreet() + ", " + this.getVillageName() + ", " + this.getDistrict() + ", " + this.getState() + ", " + this.getPinCode() + " ]";
    }
}
