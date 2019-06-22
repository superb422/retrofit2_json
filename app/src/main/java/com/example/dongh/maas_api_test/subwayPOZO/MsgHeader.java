package com.example.dongh.maas_api_test.subwayPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MsgHeader {
    @SerializedName("headerCd")
    @Expose
    private int headerCd;
    @SerializedName("headerMsg")
    @Expose
    private String headerMsg;
    @SerializedName("itemCount")
    @Expose
    private int itemCount;

    public int getHeaderCd() {
        return headerCd;
    }

    public void setHeaderCd(int headerCd) {
        this.headerCd = headerCd;
    }

    public String getHeaderMsg() {
        return headerMsg;
    }

    public void setHeaderMsg(String headerMsg) {
        this.headerMsg = headerMsg;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
