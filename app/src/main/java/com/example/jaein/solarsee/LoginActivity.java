package com.example.jaein.solarsee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    int JOIN_OK = -100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void joinBtnClick(View view) {
        Intent intent = new Intent(this, JoinActivity.class);
        startActivityForResult(intent, JOIN_OK);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == JOIN_OK){
            if(resultCode == RESULT_OK){
            }
        }
    }

    public void loginBtnClick(View view) {
        //DB와 비교
        //mainActivity로 넘기기
    }
}
