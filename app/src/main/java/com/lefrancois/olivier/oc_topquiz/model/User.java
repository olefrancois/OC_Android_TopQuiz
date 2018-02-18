package com.lefrancois.olivier.oc_topquiz.model;

/**
 * Created by olivier on 18/02/2018.
 */

public class User {

    private String mFirstname;

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
}
