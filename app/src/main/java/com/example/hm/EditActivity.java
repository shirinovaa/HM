package com.example.hm;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hm.databinding.ActivityEditBinding;

public class EditActivity extends AppCompatActivity {
    private ActivityEditBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityEditBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        initialisation();
        listeners();
    }

    private void initialisation() {
        Intent intent = getIntent();
        binding.etEdit.setText(intent.getStringExtra("1"));
    }

    private void listeners() {
        binding.btnSendToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editText= binding.etEdit.getText().toString().trim();
                Intent intent = new Intent(EditActivity.this, MainActivity.class);
                intent.putExtra("key",editText);
                startActivity(intent);
            }
        });
    }
}