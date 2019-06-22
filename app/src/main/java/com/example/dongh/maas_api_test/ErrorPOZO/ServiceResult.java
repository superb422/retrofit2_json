package com.example.dongh.maas_api_test.ErrorPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceResult {

    @SerializedName("msgHeader")
    @Expose
    private MsgHeader msgHeader;

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

}
