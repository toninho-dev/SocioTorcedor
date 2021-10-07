package com.everis.socioTorecedor.Socio_Torcedor.Model;

public enum TimeEnum {
    SaoPaulo(1, "São Paulo"), Palmeiras(2, "Palmeiras"), Flamengo(3,"Flamengo");

    private long idTime;
    private String nome;

    TimeEnum(long idTime, String nome) {
        this.idTime = idTime;
        this.nome = nome;
    }
}
