package com.example.noticiando.objects;

public class Noticia {

    private String autor;
    private String conteudo;
    private String descricao;
    private String dataPublicacao;
    private String titulo;
    private String url;
    private String urlToImage;

    public Noticia(String autor, String conteudo, String descricao, String dataPublicacao, String titulo, String url, String urlToImage) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.url = url;
        this.urlToImage = urlToImage;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}