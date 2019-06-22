package com.example.dongh.maas_api_test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RetroBaseApiService {
    //String Base_URL = "https://gateway.openapi.t-money.co.kr:5556/gateway/koLoadInfo/v1/";
    String Base_URL = "https://apigw.tmoney.co.kr:5556/gateway/koLoadInfo/v1/";
    //String Base_URL = "https://gateway.openapi.t-money.co.kr:5556/gateway/subStnListGet/v1/subStnList/";


    //-----------------------단일 쿼리--------------------------------------//
    @Headers({
            "x-Gateway-APIKey: 1cf26bcf-a996-487a-a0a7-91ba86b090c0",
            "Accept: application/json",
    })
    @GET("load_info/{APIname}")
    Call<ResponseGet> getFirst(@Path("APIname") String id);


    //-------------------------다중 쿼리--------------------------------//
    @Headers({
            "x-Gateway-APIKey: 1cf26bcf-a996-487a-a0a7-91ba86b090c0",
            "Accept: application/x-www-form-urlencoded",
            "Accept: application/xml"
    })
    @GET("getStnList")
    Call<List<ResponseMultiGet>> getSecond(@QueryMap HashMap<String,String> parameters);

    @FormUrlEncoded
    @POST("/posts")
    Call<ResponseGet> postFirst(@FieldMap HashMap<String, Object> parameters);

    @PUT("/posts/1")
    Call<ResponseGet> putFirst(@Body RequestPut parameters);

    @FormUrlEncoded
    @PATCH("/posts/1")
    Call<ResponseGet> patchFirst(@Field("title") String title);

    @DELETE("/posts/1")
    Call<ResponseBody> deleteFirst();
}

