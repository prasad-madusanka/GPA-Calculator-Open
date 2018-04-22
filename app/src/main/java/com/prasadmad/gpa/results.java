package com.prasadmad.gpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableRow;

/**
 * Created by Prasad on 4/30/17.
 */

public class results extends AppCompatActivity {

    private Bundle bundle;
    private common commonAtt;

    private TableRow row3,row4,row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15,row16,row17,row18,row19,row20,row21,row22,row23,row24,row25,row26,row27,row28,row29,row30;
    private Spinner sr1,sr2,sr3,sr4,sr5,sr6,sr7,sr8,sr9,sr10,sr11,sr12,sr13,sr14,sr15,sr16,sr17,sr18,sr19,sr20,sr21,sr22,sr23,sr24,sr25,sr26,sr27,sr28,sr29,sr30;
    private Spinner sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8,sc9,sc10,sc11,sc12,sc13,sc14,sc15,sc16,sc17,sc18,sc19,sc20,sc21,sc22,sc23,sc24,sc25,sc26,sc27,sc28,sc29,sc30;
    private Button calculate;
    private float[] results =new float[30];
    private int[] credits =new int[30];
    private int nSubs=4;
    private float score,distinction;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(results.this,MainActivity.class));
        overridePendingTransitionExit();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);

        try {

            bundle = getIntent().getExtras();
            nSubs = bundle.getInt("SUBS");
            score = bundle.getFloat("SCORE");
            distinction = bundle.getFloat("DISTINCTION");
            initialize(nSubs);
            commonAtt = new common();


                sc1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[0] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[1] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[2] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[3] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[4] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[5] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[6] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[7] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[8] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[9] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[10] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[11] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[12] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[13] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[14] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[15] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[16] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[17] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[18] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[19] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[20] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[21] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[22] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[23] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[24] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc26.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[25] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc27.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[26] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[27] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[28] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sc30.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        credits[29] = commonAtt.returnCredit(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                sr1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[0] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[1] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[2] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[3] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[4] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[5] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[6] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[7] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[8] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[9] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[10] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[11] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[12] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[13] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[14] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[15] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[16] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[17] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[18] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[19] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[20] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[21] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[22] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[23] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[24] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr26.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[25] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr27.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[26] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[27] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[28] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                sr30.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        results[29] = commonAtt.returnGPA(position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            calculate();
                        } catch (Exception ex) {
                            Log.d("Calculate", ex.toString());
                        }
                    }
                });

            } catch (Exception ex) {
                Log.d("results", ex.toString());
            }

    }

    private void initializeTableRow()throws Exception{
        row3=(TableRow)findViewById(R.id.row3);
        row4=(TableRow)findViewById(R.id.row4);
        row5=(TableRow)findViewById(R.id.row5);
        row6=(TableRow)findViewById(R.id.row6);
        row7=(TableRow)findViewById(R.id.row7);
        row8=(TableRow)findViewById(R.id.row8);
        row9=(TableRow)findViewById(R.id.row9);
        row10=(TableRow)findViewById(R.id.row10);
        row11=(TableRow)findViewById(R.id.row11);
        row12=(TableRow)findViewById(R.id.row12);
        row13=(TableRow)findViewById(R.id.row13);
        row14=(TableRow)findViewById(R.id.row14);
        row15=(TableRow)findViewById(R.id.row15);
        row16=(TableRow)findViewById(R.id.row16);
        row17=(TableRow)findViewById(R.id.row17);
        row18=(TableRow)findViewById(R.id.row18);
        row19=(TableRow)findViewById(R.id.row19);
        row20=(TableRow)findViewById(R.id.row20);
        row21=(TableRow)findViewById(R.id.row21);
        row22=(TableRow)findViewById(R.id.row22);
        row23=(TableRow)findViewById(R.id.row23);
        row24=(TableRow)findViewById(R.id.row24);
        row25=(TableRow)findViewById(R.id.row25);
        row26=(TableRow)findViewById(R.id.row26);
        row27=(TableRow)findViewById(R.id.row27);
        row28=(TableRow)findViewById(R.id.row28);
        row29=(TableRow)findViewById(R.id.row29);
        row30=(TableRow)findViewById(R.id.row30);

    }

    private void visibility(TableRow tableRow)throws Exception{
        tableRow.setVisibility(View.GONE);
    }

    private void setUpMargins(TableRow tableRow) throws Exception{
        ViewGroup.MarginLayoutParams params=(ViewGroup.MarginLayoutParams)tableRow.getLayoutParams();
        params.setMargins(0,0,0,150);
    }

    private void initMethod(int value) throws Exception{

        if(value==2){
            visibility(row3);
            visibility(row4);
            visibility(row5);
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==3){
            visibility(row4);
            visibility(row5);
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        } else if(value==4){
            visibility(row5);
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==5){
            visibility(row6);
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        } else if(value==6) {
            visibility(row7);
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==7){
            visibility(row8);
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==8){
            visibility(row9);
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==9){
            visibility(row10);
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
        }else if(value==10){
            visibility(row11);
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row10);
        }else if(value==11){
            visibility(row12);
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row11);
        }else if(value==12){
            visibility(row13);
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row12);
        }else if(value==13){
            visibility(row14);
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row13);
        }else if(value==14){
            visibility(row15);
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row14);
        }else if(value==15){
            visibility(row16);
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row15);
        }else if(value==16){
            visibility(row17);
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row16);
        }else if(value==17){
            visibility(row18);
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row17);
        }else if(value==18){
            visibility(row19);
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row18);
        }else if(value==19){
            visibility(row20);
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row19);
        }else if(value==20){
            visibility(row21);
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row20);
        }else if(value==21){
            visibility(row22);
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row21);
        }else if(value==22){
            visibility(row23);
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row22);
        }else if(value==23){
            visibility(row24);
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row23);
        }else if(value==24){
            visibility(row25);
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row24);
        }else if(value==25){
            visibility(row26);
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row15);
        }else if(value==26){
            visibility(row27);
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row26);
        }else if(value==27){
            visibility(row28);
            visibility(row29);
            visibility(row30);
            setUpMargins(row27);
        }else if(value==28){
            visibility(row29);
            visibility(row30);
            setUpMargins(row29);
        }else if(value==29){
            visibility(row30);
            setUpMargins(row29);
        }else if(value==30){
            setUpMargins(row30);
        }

    }

    private void initializeSpinnerResult()throws Exception{
        sr1=(Spinner)findViewById(R.id.sr1);
        sr2=(Spinner)findViewById(R.id.sr2);
        sr3=(Spinner)findViewById(R.id.sr3);
        sr4=(Spinner)findViewById(R.id.sr4);
        sr5=(Spinner)findViewById(R.id.sr5);
        sr6=(Spinner)findViewById(R.id.sr6);
        sr7=(Spinner)findViewById(R.id.sr7);
        sr8=(Spinner)findViewById(R.id.sr8);
        sr9=(Spinner)findViewById(R.id.sr9);
        sr10=(Spinner)findViewById(R.id.sr10);
        sr11=(Spinner)findViewById(R.id.sr11);
        sr12=(Spinner)findViewById(R.id.sr12);
        sr13=(Spinner)findViewById(R.id.sr13);
        sr14=(Spinner)findViewById(R.id.sr14);
        sr15=(Spinner)findViewById(R.id.sr15);
        sr16=(Spinner)findViewById(R.id.sr16);
        sr17=(Spinner)findViewById(R.id.sr17);
        sr18=(Spinner)findViewById(R.id.sr18);
        sr19=(Spinner)findViewById(R.id.sr19);
        sr20=(Spinner)findViewById(R.id.sr20);
        sr21=(Spinner)findViewById(R.id.sr21);
        sr22=(Spinner)findViewById(R.id.sr22);
        sr23=(Spinner)findViewById(R.id.sr23);
        sr24=(Spinner)findViewById(R.id.sr24);
        sr25=(Spinner)findViewById(R.id.sr25);
        sr26=(Spinner)findViewById(R.id.sr26);
        sr27=(Spinner)findViewById(R.id.sr27);
        sr28=(Spinner)findViewById(R.id.sr28);
        sr29=(Spinner)findViewById(R.id.sr29);
        sr30=(Spinner)findViewById(R.id.sr30);
    }

    private void initializeSpinnerCredit()throws Exception{
        sc1=(Spinner)findViewById(R.id.credit1);
        sc2=(Spinner)findViewById(R.id.credit2);
        sc3=(Spinner)findViewById(R.id.credit3);
        sc4=(Spinner)findViewById(R.id.credit4);
        sc5=(Spinner)findViewById(R.id.credit5);
        sc6=(Spinner)findViewById(R.id.credit6);
        sc7=(Spinner)findViewById(R.id.credit7);
        sc8=(Spinner)findViewById(R.id.credit8);
        sc9=(Spinner)findViewById(R.id.credit9);
        sc10=(Spinner)findViewById(R.id.credit10);
        sc11=(Spinner)findViewById(R.id.credit11);
        sc12=(Spinner)findViewById(R.id.credit12);
        sc13=(Spinner)findViewById(R.id.credit13);
        sc14=(Spinner)findViewById(R.id.credit14);
        sc15=(Spinner)findViewById(R.id.credit15);
        sc16=(Spinner)findViewById(R.id.credit16);
        sc17=(Spinner)findViewById(R.id.credit17);
        sc18=(Spinner)findViewById(R.id.credit18);
        sc19=(Spinner)findViewById(R.id.credit19);
        sc20=(Spinner)findViewById(R.id.credit20);
        sc21=(Spinner)findViewById(R.id.credit21);
        sc22=(Spinner)findViewById(R.id.credit22);
        sc23=(Spinner)findViewById(R.id.credit23);
        sc24=(Spinner)findViewById(R.id.credit24);
        sc25=(Spinner)findViewById(R.id.credit25);
        sc26=(Spinner)findViewById(R.id.credit26);
        sc27=(Spinner)findViewById(R.id.credit27);
        sc28=(Spinner)findViewById(R.id.credit28);
        sc29=(Spinner)findViewById(R.id.credit29);
        sc30=(Spinner)findViewById(R.id.credit30);
    }

    private void initialize(int value)throws Exception{
        initializeTableRow();
        initMethod(value);
        initializeSpinnerResult();
        initializeSpinnerCredit();
        calculate=(Button)findViewById(R.id.btnCalculate);

    }

    private void calculate() throws Exception{
        float result;
        result = commonAtt.sumOfResult(results,credits,0,nSubs-1)/ commonAtt.creditSumCustom(credits, nSubs);
        startActivity(new Intent(results.this,showResult.class).putExtra("GPA", commonAtt.twoPlaces(result)).putExtra("SCORE", score).putExtra("DISTINCTION", distinction));
        overridePendingTransitionEnter();

    }

    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    protected void overridePendingTransitionExit() {
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}