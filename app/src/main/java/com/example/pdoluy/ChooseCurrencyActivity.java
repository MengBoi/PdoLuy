package com.example.pdoluy;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChooseCurrencyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_currency);

        // Make a reference to the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.pickCurrencyView);

        // Create and set a layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create and set an adapter
        Currencies[] currencies = loadCurrency();
        ChooseCurrencyAdapter adapter = new ChooseCurrencyAdapter(currencies);
        recyclerView.setAdapter(adapter);
    }
    private Currencies[] loadCurrency() {
        Currencies curr1 = new Currencies();
        curr1.setCurrency("KHR");
        Currencies curr2 = new Currencies();
        curr2.setCurrency("CYN");
        return new Currencies[]{curr1,curr2};
    }
}
