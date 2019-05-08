package com.sayed.dclapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import android.support.design.widget.BottomSheetDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_fade_out);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void clicker(View v){
        if(v.getId()== R.id.step1_layout){

            startActivity(new Intent(MainActivity.this, AgreementActivity.class));
        }
        if(v.getId() == R.id.step2_layout){
            int layoutName = R.layout.dialog_layout_s2;
            sheetDisplay(layoutName);
        }
        if(v.getId() == R.id.step3_layout){
            int layoutName = R.layout.dialog_layout_s3;
            sheetDisplay(layoutName);
        }
    }

    public void sheetDisplay(int layoutName){
        View view = getLayoutInflater().inflate(layoutName, null);

        final BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this);
        dialog.setContentView(view);
        dialog.show();
//        TextView preview = (TextView) view.findViewById(R.id.preview);
//        TextView share = (TextView) view.findViewById(R.id.share);
//        TextView getlink = (TextView) view.findViewById(R.id.getlink);
//        TextView copy = (TextView) view.findViewById(R.id.copy);
//        TextView email = (TextView) view.findViewById(R.id.email);
    }

}
