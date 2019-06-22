package com.example.dongh.maas_api_test.corPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TerNotiList {
    @SerializedName("TER_COD")
    @Expose
    private String tERCOD;

    public String getTERCOD() {
        return tERCOD;
    }

    public void setTERCOD(String tERCOD) {
        this.tERCOD = tERCOD;
    }
}
