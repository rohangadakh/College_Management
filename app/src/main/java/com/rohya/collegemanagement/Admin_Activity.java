package com.rohya.collegemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Button btnAddData = findViewById(R.id.btnAddData);
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity_2.class));
            }
        });

        Button btnSedNotify = findViewById(R.id.btnSendNotification);
        btnSedNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://dashboard.onesignal.com/apps/60287ee3-cae2-4049-a3a6-b25d0ce0eec9#outcomes=os__click__count,os__confirmed_delivery__count";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });
    }
}