package com.example.dongh.maas_api_test.subwayPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemList {
    @SerializedName("statnId")
    @Expose
    private String statnId;
    @SerializedName("statnNm")
    @Expose
    private String statnNm;
    @SerializedName("subwayId")
    @Expose
    private String subwayId;
    @SerializedName("subwayNm")
    @Expose
    private String subwayNm;

    public String getStatnId() {
        return statnId;
    }

    public void setStatnId(String statnId) {
        this.statnId = statnId;
    }

    public String getStatnNm() {
        return statnNm;
    }

    public void setStatnNm(String statnNm) {
        this.statnNm = statnNm;
    }

    public String getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(String subwayId) {
        this.subwayId = subwayId;
    }

    public String getSubwayNm() {
        return subwayNm;
    }

    public void setSubwayNm(String subwayNm) {
        this.subwayNm = subwayNm;
    }
}
