package com.example.pdoluy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onConvertActivityPress (View view) {
        Intent intent = new Intent(this, ConvertActivity.class);
        startActivity(intent);
    }
    public void onShowRateActivityPress (View view) {
        Intent intent = new Intent(this, ShowRateActivity.class);
        startActivity(intent);
    }
    public void onSpendingTackerPress (View view) {
        Intent intent = new Intent(this, SpendingTrackerActivity.class);
        startActivity(intent);
    }

}

