package com.example.pdoluy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChooseCurrencyAdapter extends RecyclerView.Adapter<CurrencyViewHolder> {
    //Dataset
    private Currencies[] currencies;

    public ChooseCurrencyAdapter(Currencies[] currencies) {
        this.currencies = currencies;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Load a layout file
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_holder_currency, parent, false);
        CurrencyViewHolder viewHolder = new CurrencyViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currencies currency = currencies[position];
        holder.bind(currency);
    }

    @Override
    public int getItemCount() {
        return currencies.length;
    }
}
