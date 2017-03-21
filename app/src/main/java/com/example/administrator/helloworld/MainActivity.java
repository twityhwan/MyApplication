package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView getTextView = (TextView)findViewById(R.id.tv1);
        TextView setTextView = (TextView)findViewById(R.id.tv2);

        setTextView.setText("Text: "+getTextView.getText() + "\n" +
                    "TextSize: "+getTextView.getTextSize()+"" +"\n" +
                    "PaddingLeft: "+getTextView.getPaddingLeft());
    }
}
