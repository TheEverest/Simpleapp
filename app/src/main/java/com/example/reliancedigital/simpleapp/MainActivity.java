package com.example.reliancedigital.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    TextView textView;
    Button button1,button2,button3,buttonreset;
    int click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=(TextView) findViewById(R.id.textone);
        Button button1=(Button) findViewById(R.id.buttonone);
        button1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        click++;
                        textView.setText("clicked value is : "+click);
                    }
                }
        );
       Button button2 =(Button) findViewById(R.id.buttontwo);
        button2.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        click--;
                        textView.setText("clicked value is : "+click);
                    }
                }
        );
        Button button3 =(Button) findViewById(R.id.buttonthree);
        button3.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        click=click*2;
                        textView.setText("clicked value is : "+click);
                    }
                }
        );
        Button buttonreset =(Button) findViewById(R.id.buttonfourth);
        buttonreset.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        click=0;
                        textView.setText("clicked value is : "+click);
                    }
                }
        );
    }
}
