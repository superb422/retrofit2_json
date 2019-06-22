package com.example.dongh.maas_api_test.corPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("cor_list")
    @Expose
    private List<CorList> corList = null;
    @SerializedName("in_date")
    @Expose
    private String inDate;
    @SerializedName("ter_noti_list")
    @Expose
    private List<TerNotiList> terNotiList = null;
    @SerializedName("ter_list")
    @Expose
    private List<TerList> terList = null;
    @SerializedName("lin_list")
    @Expose
    private List<LinList> linList = null;
    @SerializedName("resultStatus")
    @Expose
    private String resultStatus;

    public List<CorList> getCorList() {
        return corList;
    }

    public void setCorList(List<CorList> corList) {
        this.corList = corList;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public List<TerNotiList> getTerNotiList() {
        return terNotiList;
    }

    public void setTerNotiList(List<TerNotiList> terNotiList) {
        this.terNotiList = terNotiList;
    }

    public List<TerList> getTerList() {
        return terList;
    }

    public void setTerList(List<TerList> terList) {
        this.terList = terList;
    }

    public List<LinList> getLinList() {
        return linList;
    }

    public void setLinList(List<LinList> linList) {
        this.linList = linList;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }
}
