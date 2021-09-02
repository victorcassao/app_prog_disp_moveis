package com.example.noticiando;

public class Noticia {

    private String nome;
    private String tittulo;
    private String descricao;
    private String url;

    public Noticia(String nome, String tittulo, String descricao, String url) {
        this.nome = nome;
        this.tittulo = tittulo;
        this.descricao = descricao;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTittulo() {
        return tittulo;
    }

    public void setTittulo(String tittulo) {
        this.tittulo = tittulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
