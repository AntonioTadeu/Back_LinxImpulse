package com.uvass.linximpulse.model.entity;

public class Produto {
    private int id;
    private String nome;
    private String foto;
    private float preco_antigo;
    private float preco;
    private String descricao;
    private Parcela parcela;
    private int parcela_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getPreco_antigo() {
        return preco_antigo;
    }

    public void setPreco_antigo(float preco_antigo) {
        this.preco_antigo = preco_antigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public int getParcela_id() {
        return parcela_id;
    }

    public void setParcela_id(int parcela_id) {
        this.parcela_id = parcela_id;
    }
}
