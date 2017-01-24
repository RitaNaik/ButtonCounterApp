package com.example.rita_pc.btncounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdtCounter;
    Button mbtnCounter;
    int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtCounter=(EditText)findViewById(R.id.edtCounter);
        mbtnCounter=(Button)findViewById(R.id.btnCounter);

        mbtnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(mCount==0)
                    {
                        mCount=1;
                        mEdtCounter.setText(String.valueOf(mCount));
                    }
                    else
                    {

                        mCount++;
                        mEdtCounter.setText(String.valueOf(mCount));
                    }

            }
        });


    }
}
