package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnS;
    private TextView resV;
    private Spinner spnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to XML
        btnS = findViewById(R.id.btnS);
        resV = findViewById(R.id.resV);
        spnB = findViewById(R.id.spnB);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                resV.setText(spnB.getSelectedItem().toString());
                String cat = spnB.getSelectedItem().toString();
                //create DB object
                DB db = new DB();
                List<Book> result = db.getBooks(cat);
                String str = "";
                for (Book b: result) {
                    str+=b.getTitle() +" by " +b.getAuthor() +"\n\n";

                }
                resV.setText(str);
            }
        });
    }
}