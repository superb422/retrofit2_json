package com.example.dongh.maas_api_test;

import com.example.dongh.maas_api_test.subwayPOZO.ServiceResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResponseMultiGet {
    @SerializedName("ServiceResult")
    @Expose
    private ServiceResult serviceResult;

    public ServiceResult getServiceResult() {
        return serviceResult;
    }

    public void setServiceResult(ServiceResult serviceResult) {
        this.serviceResult = serviceResult;
    }
}
