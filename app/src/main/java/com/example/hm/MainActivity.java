package com.example.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        listeners();
        initialisation();
    }



    private void listeners() {
        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                startActivity(intent);

            }
        });
        binding.tvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.tvMain.getText() == null) {
                    Intent intent = new Intent(MainActivity.this, EditActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, EditActivity.class);
                    intent.putExtra("1", binding.tvMain.getText().toString());
                    startActivity(intent);

                }

            }
        });
    }
    private void initialisation() {
        Intent intent = getIntent();
        binding.tvMain.setText(intent.getStringExtra("key"));
    }
}