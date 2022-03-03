package com.example.ft_newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       this.tvMain = (TextView)findViewById(R.id.tvMain);
       this.tvMain.setText("Push button to change text");
    }



    public void onBtnMainClck(View view) {

        this.tvMain.setText("Text was changed");
    }

    public void onBtnTxtClrClick(View view) {
        tvMain.setTextColor(Color.GREEN);


    }
}