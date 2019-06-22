package com.example.dongh.maas_api_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dongh.maas_api_test.corPOZO.CorList;
import com.example.dongh.maas_api_test.subwayPOZO.ItemList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String LOG = "MainActivity";
    TextView codeResultTextView,corname,corid,errorResultTextView;
    RetroClient retroClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codeResultTextView = findViewById(R.id.code_result);
        corname = findViewById(R.id.cor_name);
        corid = findViewById(R.id.cor_id);
        errorResultTextView = findViewById(R.id.error_result);

        retroClient = RetroClient.getInstance(this).createBaseApi();


        Button getbtn = findViewById(R.id.get1);
        getbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retroClient.getFirst("20181029163845", new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.d("dd", t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");

                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        ResponseGet data = (ResponseGet) receivedData;
                        codeResultTextView.setText(data.getCode());
                        errorResultTextView.setText("정상");

                        List<CorList> corDatas = new ArrayList(data.getResponse().getCorList());
                        for(CorList datas : corDatas){
                            corname.setText(datas.getCORNAM());
                            corid.setText(datas.getCORCOD());
                        }

                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        errorResultTextView.setText("Failure");
                    }
                });
            }
        });

       Button get2btn = findViewById(R.id.get2);
       get2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,String> paramaters = new HashMap<>();
                paramaters.put("serviceKey","01234567890");
                paramaters.put("statnNm","강남");

                retroClient.getSecond(paramaters,new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.e(LOG, t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");
                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        //List<ResponseMultiGet> data = (List<ResponseMultiGet>) receivedData;
                        ResponseMultiGet data = (ResponseMultiGet)receivedData;
                        codeResultTextView.setText(String.valueOf(code));

                        List<ItemList> subwayDatas = new ArrayList(data.getServiceResult().getMsgBody().getItemList());
                        if (!subwayDatas.isEmpty()) {
                            for(ItemList datas : subwayDatas){
//                                corname.setText(datas.getCORNAM());
//                                corid.setText(datas.getCORCOD());
                            }

                        } else {
                            corname.setText("Empty");
                            corid.setText("Empty");

                        }
                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        errorResultTextView.setText("Failure");
                    }
                });
            }
        });

       /*
        Button postbtn = findViewById(R.id.post);
        postbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("title", "foo");
                parameters.put("body", "bar");
                parameters.put("userId", 1);

                retroClient.postFirst(parameters, new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.e(LOG, t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");
                        idResultTextView.setText("Error");
                        titleResultTextView.setText("Error");
                        useridResultTextView.setText("Error");
                        bodyResultTextView.setText("Error");
                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        ResponseGet data = (ResponseGet) receivedData;
                        codeResultTextView.setText(String.valueOf(code));
                        idResultTextView.setText(String.valueOf(data.id));
                        titleResultTextView.setText(data.title);
                        useridResultTextView.setText(String.valueOf(data.userId));
                        bodyResultTextView.setText(data.body);
                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        idResultTextView.setText("Failure");
                        titleResultTextView.setText("Failure");
                        useridResultTextView.setText("Failure");
                        bodyResultTextView.setText("Failure");
                    }
                });
            }
        });

        Button putbtn = findViewById(R.id.put);
        putbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("title", "foo");
                parameters.put("body", "bar");
                parameters.put("userId", 1);
                parameters.put("id", 1);

                retroClient.putFirst(parameters, new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.e(LOG, t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");
                        idResultTextView.setText("Error");
                        titleResultTextView.setText("Error");
                        useridResultTextView.setText("Error");
                        bodyResultTextView.setText("Error");
                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        ResponseGet data = (ResponseGet) receivedData;
                        codeResultTextView.setText(String.valueOf(code));
                        idResultTextView.setText(String.valueOf(data.id));
                        titleResultTextView.setText(data.title);
                        useridResultTextView.setText(String.valueOf(data.userId));
                        bodyResultTextView.setText(data.body);
                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        idResultTextView.setText("Failure");
                        titleResultTextView.setText("Failure");
                        useridResultTextView.setText("Failure");
                        bodyResultTextView.setText("Failure");
                    }
                });

            }
        });

        Button patchbtn = findViewById(R.id.patch);
        patchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retroClient.createBaseApi().patchFirst("foo", new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.e(LOG, t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");
                        idResultTextView.setText("Error");
                        titleResultTextView.setText("Error");
                        useridResultTextView.setText("Error");
                        bodyResultTextView.setText("Error");
                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        ResponseGet data = (ResponseGet) receivedData;
                        codeResultTextView.setText(String.valueOf(code));
                        idResultTextView.setText(String.valueOf(data.id));
                        titleResultTextView.setText(data.title);
                        useridResultTextView.setText(String.valueOf(data.userId));
                        bodyResultTextView.setText(data.body);
                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        idResultTextView.setText("Failure");
                        titleResultTextView.setText("Failure");
                        useridResultTextView.setText("Failure");
                        bodyResultTextView.setText("Failure");
                    }
                });

            }
        });

        Button deletebtn = findViewById(R.id.delete);
        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retroClient.deleteFirst(new RetroCallback() {
                    @Override
                    public void onError(Throwable t) {
                        Log.e(LOG, t.toString());
                        errorResultTextView.setText(t.toString());
                        codeResultTextView.setText("Error");
                        idResultTextView.setText("Error");
                        titleResultTextView.setText("Error");
                        useridResultTextView.setText("Error");
                        bodyResultTextView.setText("Error");
                    }

                    @Override
                    public void onSuccess(int code, Object receivedData) {
                        codeResultTextView.setText(String.valueOf(code));
                        idResultTextView.setText("");
                        titleResultTextView.setText("");
                        useridResultTextView.setText("");
                        bodyResultTextView.setText("");
                    }

                    @Override
                    public void onFailure(int code) {
                        codeResultTextView.setText(code);
                        idResultTextView.setText("Failure");
                        titleResultTextView.setText("Failure");
                        useridResultTextView.setText("Failure");
                        bodyResultTextView.setText("Failure");
                    }
                });

            }
        });*/
    }
}


