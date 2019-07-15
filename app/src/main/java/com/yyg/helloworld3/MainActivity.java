package com.yyg.helloworld3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //    private Button nBtnTextView, mBtnButton, mBtnEditText, mBtnRadioButton;
//
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
//        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
//        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                跳转到RadioButton演示界面
//                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    private void setListener() {
        OnClick onClick = new OnClick();
        findViewById(R.id.btn_textview).setOnClickListener(onClick);
        findViewById(R.id.btn_button).setOnClickListener(onClick);
        findViewById(R.id.btn_edittext).setOnClickListener(onClick);
        findViewById(R.id.btn_radiobutton).setOnClickListener(onClick);
        findViewById(R.id.btn_checkbox).setOnClickListener(onClick);
        findViewById(R.id.btn_imageview).setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
//                    跳转到TextView界面
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
//                    跳转到Button界面
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
//                    跳转到EditText界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
//                    跳转到RadioButton界面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
//                    跳转到ImageView演示界面
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}