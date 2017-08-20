package com.example.android.tourguideapp;

/**
 * Created by Basia on 2017-02-17.
 */

public class Places {

    /** Name of the place */
    private int mName = NO_TEXT_PROVIDED;

    /** Address of the place */
    private int mAddress = NO_TEXT_PROVIDED;

    /** Phone of the place */
    private int mPhone = NO_TEXT_PROVIDED;

    /** Prices in the restaurant */
    private int mPrices = NO_TEXT_PROVIDED;

    /** Cuisine of the restaurant */
    private int mCuisine = NO_TEXT_PROVIDED;

    /** Description of the place */
    private int mDescription = NO_TEXT_PROVIDED;

    /** Map for the place */
    private int mMap = NO_IMAGE_PROVIDED;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constant value that represents no text was provided for this place */
    private static final int NO_TEXT_PROVIDED = -1;

    // Hotel
    public Places(int name, int address, int phone, int imageResourceId, int map){
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mPhone = phone;
        mMap = map;
    }

    // Restaurant
    public Places(int name, int address, int phone, int prices, int cuisine, int imageResourceId,
                  int map){
        mName = name;
        mAddress = address;
        mPhone = phone;
        mPrices = prices;
        mCuisine = cuisine;
        mImageResourceId = imageResourceId;
        mMap = map;
    }

    // Things to do
    public Places(int name, int description, int imageResourceId, int map){
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = description;
        mMap = map;
    }

    // Events
    public Places(int name, int description, int imageResourceId){
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = description;
    }

    /** Get the name of the place. */
    public int getHeader() {
        return mName;
    }

    /**
     * Returns whether or not there is an address for this place.
     */
    public boolean hasAddress() {
        return mAddress != NO_TEXT_PROVIDED;
    }

    /**
     * Returns whether or not there is a phone for this place.
     */
    public boolean hasPhone() {
        return mPhone != NO_TEXT_PROVIDED;
    }

    /**
     * Returns whether or not there are prices for this place.
     */
    public boolean hasPrices() {
        return mPrices != NO_TEXT_PROVIDED;
    }

    /**
     * Returns whether or not there is a cuisine for this place.
     */
    public boolean hasCuisine() {
        return mCuisine != NO_TEXT_PROVIDED;
    }

    /**
     * Returns whether or not there is a description for this place.
     */
    public boolean hasDescription() {
        return mDescription != NO_TEXT_PROVIDED;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns whether or not there is a map for this place.
     */
    public boolean hasMap() {
        return mMap != NO_IMAGE_PROVIDED;
    }

    /** Get the address of the place. */
    public int getAddress() {
        return mAddress;
    }

    /** Get the phone of the place. */
    public int getPhone() {
        return mPhone;
    }

    /** Get the prices of the place. */
    public int getPrices() {
        return mPrices;
    }

    /** Get the cuisine of the place. */
    public int getCuisine() {
        return mCuisine;
    }

    /** Get the description of the place. */
    public int getDescription() {
        return mDescription;
    }

    /** Return the image resource ID of the place.      */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /** Return map for the place.      */
    public int getMap() {
        return mMap;
    }

}
