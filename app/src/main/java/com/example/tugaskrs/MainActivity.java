package com.example.tugaskrs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugaskrs.Admin.HomeAdmin;
import com.example.tugaskrs.Dosen.HomeDosen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().hide();

        Button btnSignIn = (Button)findViewById(R.id.btnLogin);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeAdmin.class);
                startActivity(intent);
            }
        });
        Button btnSignInMhs = (Button)findViewById(R.id.btnLoginDsn);
        btnSignInMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeDosen.class);
                startActivity(intent);
            }
        });


    }
}
