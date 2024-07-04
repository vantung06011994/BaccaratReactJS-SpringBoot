package com.bacarat.livebacaratbackend.dto;

public class DataResponse {

    private String status;

    public DataResponse (String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
