package com.zoraf.Tubewell_Information.POJO;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginInformation implements Serializable {

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public LoginInformation() {
    }

    public LoginInformation(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
