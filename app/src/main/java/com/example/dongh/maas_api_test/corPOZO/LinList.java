package com.example.dongh.maas_api_test.corPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinList {
    @SerializedName("LIN_COD")
    @Expose
    private String lINCOD;

    public String getLINCOD() {
        return lINCOD;
    }

    public void setLINCOD(String lINCOD) {
        this.lINCOD = lINCOD;
    }
}
