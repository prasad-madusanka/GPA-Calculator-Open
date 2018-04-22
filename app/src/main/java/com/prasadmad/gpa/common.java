package com.prasadmad.gpa;

import java.math.BigDecimal;

/**
 * Created by Prasad on 4/15/17.
 */

public class common {

    protected float twoPlaces(float value)throws Exception{
        BigDecimal bd = new BigDecimal(Float.toString(value));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    protected int creditSumCustom(int[] array,int count){
        int retCredits=0;

        for (int position = 0; position< count; position++)
            retCredits=retCredits+ array[position];

        return retCredits;
    }

    protected float sumOfResult(float[] array1, int[] array2, int start, int stop){
        float sum=0;
        for (int i=start;i<=stop;i++)
            sum+=array1[i]*array2[i];

        return sum;
    }

    protected int getCorrespondingValue(int id){
        int returnThis=2;

        if(id==0)
            returnThis=2;
        else if(id==1)
            returnThis=3;
        else if(id==2)
            returnThis=4;
        else if(id==3)
            returnThis=5;
        else if(id==4)
            returnThis=6;
        else if(id==5)
            returnThis=7;
        else if(id==6)
            returnThis=8;
        else if(id==7)
            returnThis=9;
        else if(id==8)
            returnThis=10;
        else if(id==9)
            returnThis=11;
        else if(id==10)
            returnThis=12;
        else if(id==11)
            returnThis=13;
        else if(id==12)
            returnThis=14;
        else if(id==13)
            returnThis=15;
        else if(id==14)
            returnThis=16;
        else if(id==15)
            returnThis=17;
        else if(id==16)
            returnThis=18;
        else if(id==17)
            returnThis=19;
        else if(id==18)
            returnThis=20;
        else if(id==19)
            returnThis=21;
        else if(id==20)
            returnThis=22;
        else if(id==21)
            returnThis=23;
        else if(id==22)
            returnThis=24;
        else if(id==23)
            returnThis=25;
        else if(id==24)
            returnThis=26;
        else if(id==25)
            returnThis=27;
        else if(id==26)
            returnThis=28;
        else if(id==27)
            returnThis=29;
        else if(id==28)
            returnThis=30;

        return returnThis;
    }

    protected float returnGPA(int gpa){
        float var_GradePoint;

        if(gpa==0)
            var_GradePoint=4;
        else if(gpa==1)
            var_GradePoint=(float)3.7;
        else if(gpa==2)
            var_GradePoint=(float)3.3;
        else if(gpa==3)
            var_GradePoint=(float)3.0;
        else if(gpa==4)
            var_GradePoint=(float)2.7;
        else if(gpa==5)
            var_GradePoint=(float)2.3;
        else  if(gpa==6)
            var_GradePoint=(float)2.0;
        else if(gpa==7)
            var_GradePoint=(float)1.7;
        else if(gpa==8)
            var_GradePoint=(float)1.3;
        else if(gpa==9)
            var_GradePoint=(float)1.0;
        else
            var_GradePoint=0;

        return var_GradePoint;

    }

    protected int returnCredit(int position){
        int retCredit=1;

        if(position==0)
            retCredit=1;
        else if(position==1)
            retCredit=2;
        else if(position==2)
            retCredit=3;
        else if(position==3)
            retCredit=4;
        else if(position==4)
            retCredit=5;
        else if(position==5)
            retCredit=6;
        else if(position==6)
            retCredit=7;
        else if(position==7)
            retCredit=8;
        else if(position==8)
            retCredit=9;
        else if(position==9)
            retCredit=10;
        else if(position==10)
            retCredit=11;
        else if(position==11)
            retCredit=12;
        else if(position==12)
            retCredit=13;
        else if(position==13)
            retCredit=14;
        else if(position==14)
            retCredit=15;
        else if(position==15)
            retCredit=16;
        else if(position==16)
            retCredit=17;
        else if(position==17)
            retCredit=18;
        else if(position==18)
            retCredit=19;
        else if(position==19)
            retCredit=20;

        return retCredit;
    }

}
