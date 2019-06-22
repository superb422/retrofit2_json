package com.example.dongh.maas_api_test.corPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TerList {
    @SerializedName("TER_ADR")
    @Expose
    private String tERADR;
    @SerializedName("TER_LAT")
    @Expose
    private String tERLAT;
    @SerializedName("TER_TRN")
    @Expose
    private String tERTRN;
    @SerializedName("TER_ENM")
    @Expose
    private String tERENM;
    @SerializedName("DBL_COD")
    @Expose
    private String dBLCOD;
    @SerializedName("TER_COD")
    @Expose
    private String tERCOD;
    @SerializedName("TER_NAM")
    @Expose
    private String tERNAM;
    @SerializedName("TER_LON")
    @Expose
    private String tERLON;

    public String getTERADR() {
        return tERADR;
    }

    public void setTERADR(String tERADR) {
        this.tERADR = tERADR;
    }

    public String getTERLAT() {
        return tERLAT;
    }

    public void setTERLAT(String tERLAT) {
        this.tERLAT = tERLAT;
    }

    public String getTERTRN() {
        return tERTRN;
    }

    public void setTERTRN(String tERTRN) {
        this.tERTRN = tERTRN;
    }

    public String getTERENM() {
        return tERENM;
    }

    public void setTERENM(String tERENM) {
        this.tERENM = tERENM;
    }

    public String getDBLCOD() {
        return dBLCOD;
    }

    public void setDBLCOD(String dBLCOD) {
        this.dBLCOD = dBLCOD;
    }

    public String getTERCOD() {
        return tERCOD;
    }

    public void setTERCOD(String tERCOD) {
        this.tERCOD = tERCOD;
    }

    public String getTERNAM() {
        return tERNAM;
    }

    public void setTERNAM(String tERNAM) {
        this.tERNAM = tERNAM;
    }

    public String getTERLON() {
        return tERLON;
    }

    public void setTERLON(String tERLON) {
        this.tERLON = tERLON;
    }
}
