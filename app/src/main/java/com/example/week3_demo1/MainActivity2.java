package com.example.week3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText mEditText1, mEditText2;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEditText1 = (EditText) findViewById(R.id.et1);
        mEditText2 = (EditText) findViewById(R.id.et2);
        mTextView = (TextView) findViewById(R.id.tv1);
    }

    public void calculateSum(View view) {


      //  mTextView.setText("" + Integer.parseInt(mEditText1.getText().toString()) +
        //        Integer.parseInt(mEditText2.getText().toString()));
        //
        int sm= Integer.parseInt(mEditText1.getText().toString()) +
                Integer.parseInt(mEditText2.getText().toString());

        mTextView.setText(""+sm);

        Intent n= new Intent(this, MainActivity.class);
        n.putExtra("THESUM",sm);
        startActivity(n);
    }
}