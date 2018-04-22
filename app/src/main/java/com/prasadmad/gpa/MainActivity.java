package com.prasadmad.gpa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private common commonAtt;

    private Button obNext;
    private Spinner obSubs;
    private EditText obPass,obDistinction;
    private TextView warning;

    private int nSubjects=4;
    private float pass,dist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            commonAtt=new common();
            initialize();


            obSubs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    try {
                        nSubjects=commonAtt.getCorrespondingValue(position);
                    } catch (Exception e) {
                        Log.d("MainActivityobSubs",e.toString());
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            obNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        getEditTextValues();
                        if (pass<4.0 && dist<4.0 && pass>.1 && dist>0.1) {
                            startActivity(new Intent(MainActivity.this, results.class).putExtra("SUBS", nSubjects).putExtra("SCORE", pass).putExtra("DISTINCTION", dist));
                            overridePendingTransitionEnter();
                        }else {
                            warning.setText("TextEdits Cannot be empty and GPA range must be between 0.1 & 4.0");
                            warning.setTextColor(Color.RED);
                        }
                    } catch (Exception ex) {
                        Log.d("StringToFloatExcep",ex.toString());
                    }
                }
            });



        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    private void initialize()throws Exception{
        obNext=(Button) findViewById(R.id.next);
        obSubs=(Spinner)findViewById(R.id.spin);
        obPass=(EditText)findViewById(R.id.pass);
        obDistinction=(EditText)findViewById(R.id.distinction);
        warning=(TextView)findViewById(R.id.warn);
    }

    private void getEditTextValues()throws Exception{
        String pass=obPass.getText().toString();
        String dist=obDistinction.getText().toString();

        if (pass.length()!=0 && dist.length()!=0){
            try{
                this.pass=Float.valueOf(pass);
                this.dist=Float.valueOf(dist);
            }catch (Exception ex){
                Log.d("StringToFloatExcep",ex.toString());
            }
        }
    }

    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        finish();
    }

}
