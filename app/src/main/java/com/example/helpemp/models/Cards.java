package com.example.helpemp.models;

public class Cards {
    private int icone;
    private String nome;

    public Cards(int icone, String nome) {
        this.icone = icone;
        this.nome = nome;
    }

    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
