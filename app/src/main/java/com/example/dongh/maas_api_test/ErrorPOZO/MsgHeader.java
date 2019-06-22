package com.example.dongh.maas_api_test.ErrorPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MsgHeader {
    @SerializedName("headerCd")
    @Expose
    private String headerCd;
    @SerializedName("headerMsg")
    @Expose
    private String headerMsg;
    @SerializedName("itemCount")
    @Expose
    private String itemCount;

    public String getHeaderCd() {
        return headerCd;
    }

    public void setHeaderCd(String headerCd) {
        this.headerCd = headerCd;
    }

    public String getHeaderMsg() {
        return headerMsg;
    }

    public void setHeaderMsg(String headerMsg) {
        this.headerMsg = headerMsg;
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }
}
