package com.example.dongh.maas_api_test;

public interface RetroCallback<T> {
    void onError(Throwable t);

    void onSuccess(int code, T receivedData);

    void onFailure(int code);
}
