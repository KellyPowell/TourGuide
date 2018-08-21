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

    // constructor for name, city, description, image, website only
    public Destination(String destinationName, String city, String destinationDescription,
                       int imageResourceId, String destinationWebsite) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.imageResourceId = imageResourceId;
        this.destinationWebsite = destinationWebsite;
    }

    // constructor for name, city, address, imageResourceId, website
    public Destination(String destinationName, String city, String destinationDescription,
                       String destinationAddress, int imageResourceId, String destinationWebsite) {
        this.destinationName = destinationName;
        this.city = city;
        this.destinationDescription = destinationDescription;
        this.destinationAddress = destinationAddress;
        this.imageResourceId = imageResourceId;
        this.destinationWebsite = destinationWebsite;
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

}
