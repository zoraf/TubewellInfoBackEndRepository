package com.zoraf.Tubewell_Information.POJO;

import java.io.Serializable;

public class ApiResponse implements Serializable {

    private int responseCode;

    private String response;

    public ApiResponse() {
    }

    public ApiResponse(int responseCode, String response) {
        this.responseCode = responseCode;
        this.response = response;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
