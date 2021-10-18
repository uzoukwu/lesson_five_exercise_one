package com.example.lesson_five_exercise_one;

import android.annotation.SuppressLint;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentDatedandSigned extends SignedDocument{
    String pattern = "MM-dd-yyyy";
    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public String date = simpleDateFormat.format(new Date());



    public DocumentDatedandSigned(String title, String text, String signature, String date) {
        super(title, text, signature);

    }

    @Override
    public void print(){
        super.print();
        Log.d("myLog", signature + " " + date);
    }
}
