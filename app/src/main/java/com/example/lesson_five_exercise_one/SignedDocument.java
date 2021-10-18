package com.example.lesson_five_exercise_one;

import android.util.Log;

public class SignedDocument extends Document{
    String signature;

    public SignedDocument(String title, String text, String signature) {
        super(title, text);
        this.signature = signature;
    }


    @Override
    public void print(){
        super.print();
        Log.d("myLog", signature);
    }
}
