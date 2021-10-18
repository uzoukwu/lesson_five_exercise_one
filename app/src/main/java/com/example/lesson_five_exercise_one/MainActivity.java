package com.example.lesson_five_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Parent class
        Document mydocument = new Document("Doc Title", "Doc Text");
        //Child class
        SignedDocument mysigned = new SignedDocument("Signed TITLE", "Signed TEXT", "Mary B.");

        // GrandChild class
        DocumentDatedandSigned mydateandsign = new DocumentDatedandSigned("Dated TITLE", "Dated TEXT", "Mary B.","2021.10.02");

        mydocument.print();
        mysigned.print();
        mydateandsign.print();

        mydateandsign.saveDocuments("ThisPC/Documents/SaveHere/");
        mysigned.saveDocuments("ThisPC/Documents/mysigned/");







    }
}