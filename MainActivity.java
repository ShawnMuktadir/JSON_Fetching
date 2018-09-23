package com.example.mdmuktadir.json_fetching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_JSON;
    public static TextView parsedJSON;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getObject();

        button_JSON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FetchData fetchData = new FetchData();
                fetchData.execute();

            }
        });
    }


    public void getObject(){
        button_JSON = (Button)findViewById(R.id.button_JSON);
        parsedJSON = (TextView) findViewById(R.id.parsedJSON);


    }
}
