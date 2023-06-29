package com.example.ejercicioonce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.ejercicioonce.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonAvion.setOnClickListener(v -> Toast.makeText(this,"modo avion desactivado", Toast.LENGTH_SHORT).show());
        binding.buttonImagen.setOnClickListener(v -> Toast.makeText(this,"imagen guardad en galeria", Toast.LENGTH_SHORT).show());
        binding.buttonPausa.setOnClickListener(v -> Toast.makeText(this,"musica pausada", Toast.LENGTH_SHORT).show());
        binding.buttonDescarga.setOnClickListener(v -> Toast.makeText(this,"descarga completada", Toast.LENGTH_SHORT).show());
        binding.buttonNivelCinco.setOnClickListener(v -> Toast.makeText(this,"nivel 5 desbloqueado", Toast.LENGTH_SHORT).show());
        binding.buttonCuatro.setOnClickListener(v -> Toast.makeText(this,"nivel cuatro completado", Toast.LENGTH_SHORT).show());

    }
}