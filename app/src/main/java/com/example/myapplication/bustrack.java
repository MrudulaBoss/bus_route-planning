package com.example.myapplication;

import java.security.Timestamp;
import java.sql.Time;

public class bustrack {
    private Double lat;
    private Double lan;
    private Timestamp t;
    public bustrack() {
    }
    public bustrack(Double lat, Double lan, Timestamp t) {
        this.lat = lat;
        this.lan = lan;
        this.t=t;

    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLan() {
        return lan;
    }

    public void setLan(Double lan) {
        this.lan = lan;
    }

    public Timestamp getT() {
        return t;
    }

    public void setT(Timestamp t) {
        this.t = t;
    }
}



