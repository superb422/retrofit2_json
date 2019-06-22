package com.example.dongh.maas_api_test.subwayPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceResult {

    @SerializedName("msgHeader")
    @Expose
    private MsgHeader msgHeader;
    @SerializedName("msgBody")
    @Expose
    private MsgBody msgBody;

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public MsgBody getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(MsgBody msgBody) {
        this.msgBody = msgBody;
    }
}
