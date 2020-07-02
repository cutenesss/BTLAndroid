package com.example.btlandroid.model.dataAPI.account;

public class ObjectResponseLogin {

    private boolean success;
    private String expires_at;
    private String request_token;

    public ObjectResponseLogin(boolean success, String expires_at, String request_token) {
        this.success = success;
        this.expires_at = expires_at;
        this.request_token = request_token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public String getRequest_token() {
        return request_token;
    }

    public void setRequest_token(String request_token) {
        this.request_token = request_token;
    }
}
