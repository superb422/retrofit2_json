package com.example.dongh.maas_api_test;

import com.example.dongh.maas_api_test.corPOZO.Response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResponseGet {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private Response response;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
