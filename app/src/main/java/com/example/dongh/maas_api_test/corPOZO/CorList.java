package com.example.dongh.maas_api_test.corPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CorList {
    @SerializedName("COR_NAM")
    @Expose
    private String cORNAM;
    @SerializedName("COR_COD")
    @Expose
    private String cORCOD;

    public String getCORNAM() {
        return cORNAM;
    }

    public void setCORNAM(String cORNAM) {
        this.cORNAM = cORNAM;
    }

    public String getCORCOD() {
        return cORCOD;
    }

    public void setCORCOD(String cORCOD) {
        this.cORCOD = cORCOD;
    }
}
