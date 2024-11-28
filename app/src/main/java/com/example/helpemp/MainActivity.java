package com.example.helpemp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helpemp.models.Cards;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerviewGastosFixos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dados de exemplo
        List<Cards> cardsList = new ArrayList<>();
        cardsList.add(new Cards(R.drawable.baseline_oil_barrel_24, "Gasolina"));
        cardsList.add(new Cards(R.drawable.baseline_oil_barrel_24, "Álcool"));
        cardsList.add(new Cards(R.drawable.baseline_oil_barrel_24, "Diesel"));

        // Adapter
        CardsAdapter adapter = new CardsAdapter(cardsList, this);
        recyclerView.setAdapter(adapter);
    }
}