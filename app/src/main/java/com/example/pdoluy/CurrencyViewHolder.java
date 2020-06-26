package com.example.pdoluy;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CurrencyViewHolder extends RecyclerView.ViewHolder {
    private TextView txtCurrency;
    public CurrencyViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind (Currencies currency){
        txtCurrency.setText(currency.getCurrency());
    }
}
