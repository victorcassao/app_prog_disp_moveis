package com.example.noticiando;

public class Noticia {

    private String nome;
    private String titulo;
    private String descricao;
    private String url;

    public Noticia(String nome, String titulo, String descricao, String url) {
        this.nome = nome;
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
