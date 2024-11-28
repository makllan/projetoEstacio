package com.example.helpemp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helpemp.models.Cards;

import java.util.List;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardViewHolder> {

    private List<Cards> cardsList;
    private Context context;

    public CardsAdapter(List<Cards> cardsList, Context context) {
        this.cardsList = cardsList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cards, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Cards card = cardsList.get(position);
        holder.txtNome.setText(card.getNome());
        holder.txtIcone.setImageResource(card.getIcone());
    }

    @Override
    public int getItemCount() {
        return cardsList.size();
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView txtIcone;
        TextView txtNome;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            txtIcone = itemView.findViewById(R.id.txtIcone);
            txtNome = itemView.findViewById(R.id.txtNome);
        }
    }
}
