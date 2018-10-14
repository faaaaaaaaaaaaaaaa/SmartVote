package com.example.far.smartvote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button enter = findViewById(R.id.button2);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText IdNumber = findViewById(R.id.editText);
                String check = IdNumber.getText().toString();


                if(check.equals("1111111111111")){
                    new AlertDialog.Builder(Main2Activity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }
                else if(check.equals("2222222222222")){
                    new AlertDialog.Builder(Main2Activity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }else if(check.length() == 13){
                    new AlertDialog.Builder(Main2Activity.this).setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง")
                            .setMessage("คุณไม่มีสิทธิเลือกตั้ง")
                            .setNegativeButton("OK", null).show();
                }else{
                    Toast.makeText(Main2Activity.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
