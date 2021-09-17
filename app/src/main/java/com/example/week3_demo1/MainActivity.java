package com.example.week3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    int i=0;
    TextView mTextView;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.tv1);


        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"Areeb Hussain",Toast.LENGTH_LONG).show();
        });
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this::showSnack);

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new Mylsntr2());


    }
    // using method
   private void showSnack(View view) {

        Snackbar sb = Snackbar.make(view,"Hussain Areeb",Snackbar.LENGTH_LONG);
        sb.show();
    }


    //using class
    class Mylsntr implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            Snackbar sb = Snackbar.make(view,"Hussain Areeb",Snackbar.LENGTH_LONG);
            sb.show();

        }
    }
    //using class
    class Mylsntr2 implements View.OnClickListener{

        @SuppressLint("ResourceAsColor")
        @Override
        public void onClick(View view) {

        mTextView.setTextColor(R.color.purple_500);

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}

