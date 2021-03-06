package com.clinicsanddoctors.data.remote.requests;

/**
 * Created by Daro on 01/08/2017.
 */

public class ClinicsRequest {
    String latitude;
    String longitude;
    String radius;
    String specialty_id;
    String user_id;

    public ClinicsRequest setUser_id(String user_id) {
        this.user_id = user_id;
        return this;
    }

    public ClinicsRequest setCategoryId(String specialty_id) {
        this.specialty_id = specialty_id;
        return this;
    }

    public ClinicsRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public ClinicsRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public ClinicsRequest setRadius(String radius) {
        this.radius = radius;
        return this;
    }
}
