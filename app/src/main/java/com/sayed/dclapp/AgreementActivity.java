package com.sayed.dclapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AgreementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
        setContentView(R.layout.activity_agreement);
        getSupportActionBar().hide();
    }

    public void agreementClicker(View v){
        if(v.getId() == R.id.cv_demo){
            Intent i =new Intent(AgreementActivity.this, WebActivity.class);
            i.putExtra("url","https://www.youtube.com/watch?v=OO4nRh3VFM0");
            startActivity(i);
        }
        if(v.getId() == R.id.web_demo){
            Intent i =new Intent(AgreementActivity.this, WebActivity.class);
            i.putExtra("url","https://gsuite.google.com/learning-center/products/sites/get-started/#!/");
            startActivity(i);
        }
        if(v.getId() == R.id.read_oath){

        }
    }
}
