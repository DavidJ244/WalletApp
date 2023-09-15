package com.juanvargas.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList <Account> ListAccountRV = new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        LoadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_accounts);
        AccountAdapter myAdaptador = new AccountAdapter(ListAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));


    }

    private void LoadFakeData(){

        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros", 1000213.0, "https://i.pinimg.com/474x/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.jpg");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito", 1024313.0, "https://e7.pngegg.com/pngimages/526/340/png-clipart-davivienda-sede-salamina-bank-money-tucellphone-bank-text-account.png");
        Account myAccount3 = new Account("Efecty", "Efectivo", 1635333.0, "https://seeklogo.com/images/E/efecty-colombia-logo-C4C6532B80-seeklogo.com.png");
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);

    }
}