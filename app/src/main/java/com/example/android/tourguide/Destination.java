package com.example.android.tourguide;

public class Destination {

    // name of our tourist destination
    private String destinationName;

    // public string city/area name (i.e. Los Osos)
    private String city;

    // address of our tourist destination
    private String destinationAddress;

    // image/icon resource id of our tourist destination
    private int imageResourceId;

    // website address
    private String destinationWebsite;

    // phone number
    private String destinationPhone;

    // description of the destination
    private String destinationDescription;

    // boolean, whether this destination has phone
    private Boolean hasPhone;

    // boolean, whether this destination has website
    private Boolean hasWebsite;

    // boolean, whether destination has address
    private Boolean hasAddress;

    // constructor for name, city, description, address, imageResourceId
    public Destination(String destinationName, String city, String destinationDescription,
                       int imageResourceId) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.imageResourceId = imageResourceId;
        this.hasAddress = true;
        this.hasWebsite = false;
        this.hasPhone = false;
    }

    // constructor for name, city, description, imageResourceId, website
    public Destination(String destinationName, String city, String destinationDescription,
                       int imageResourceId, String destinationWebsite) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.imageResourceId = imageResourceId;
        this.destinationWebsite = destinationWebsite;
        hasWebsite = true;
        hasAddress = false;
        hasPhone = false;
    }


    // constructor for name, city, description, address, imageResourceId, website
    public Destination(String destinationName, String city, String destinationDescription,
                       String destinationAddress, int imageResourceId, String destinationWebsite) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.destinationAddress = destinationAddress;
        this.imageResourceId = imageResourceId;
        this.destinationWebsite = destinationWebsite;
        hasWebsite = true;
        hasPhone = false;
        hasAddress = true;
    }


    // constructor to hold our two name, city, address, imageResourceId, phone number, website
    public Destination(String destinationName, String city, String destinationDescription, String
            destinationAddress, int imageResourceId, String destinationWebsite, String
                               destinationPhone) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.destinationAddress = destinationAddress;
        this.imageResourceId = imageResourceId;
        this.destinationWebsite = destinationWebsite;
        this.destinationPhone = destinationPhone;
        hasPhone = true;
        hasWebsite = true;
        hasAddress = true;
    }


    // getter methods
    public String getCity() {
        return city;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDestinationDescription() {
        return destinationDescription;
    }

    public String getDestinationPhone() {
        return destinationPhone;
    }

    public String getDestinationWebsite() {
        return destinationWebsite;
    }

    public Boolean getHasPhone() { return hasPhone; }

    public Boolean getHasWebsite() {
        return hasWebsite;
    }

    public Boolean getHasAddress() {
        return hasAddress;
    }
}
