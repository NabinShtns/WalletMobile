package com.nabin.mobilewallet.model;

public class moodel {
    private String tvname;
    private String tvlocation;

    public moodel(String tvname, String tvlocation) {
        this.tvname = tvname;
        this.tvlocation = tvlocation;
    }

    public String getTvname() {
        return tvname;
    }

    public void setTvname(String tvname) {
        this.tvname = tvname;
    }

    public String getTvlocation() {
        return tvlocation;
    }

    public void setTvlocation(String tvlocation) {
        this.tvlocation = tvlocation;
    }
}
