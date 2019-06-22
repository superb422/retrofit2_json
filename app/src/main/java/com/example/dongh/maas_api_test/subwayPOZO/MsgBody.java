package com.example.dongh.maas_api_test.subwayPOZO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MsgBody {
    @SerializedName("itemList")
    @Expose
    private List<ItemList> itemList = null;

    public List<ItemList> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemList> itemList) {
        this.itemList = itemList;
    }
}
