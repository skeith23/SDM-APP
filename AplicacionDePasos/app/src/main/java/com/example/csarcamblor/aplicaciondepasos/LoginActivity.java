package com.example.csarcamblor.aplicaciondepasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void moverseAregistro(View v){
        startActivity(new Intent(getApplicationContext(),RegistroActivity.class));
    }

    public void moverseAprincipal(View v){
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

}
