package com.example.pdoluy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner currencies_spinner1 = findViewById(R.id.currencies_spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.currencies, R.layout.spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        currencies_spinner1.setAdapter(adapter);
        currencies_spinner1.setOnItemSelectedListener(this);
        Spinner currencies_spinner2 = findViewById(R.id.currencies_spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.currencies, R.layout.spinner_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        currencies_spinner2.setAdapter(adapter2);
        currencies_spinner2.setOnItemSelectedListener(this);



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


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

