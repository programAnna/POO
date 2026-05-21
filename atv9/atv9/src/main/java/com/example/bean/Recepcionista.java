package com.example.bean;

public class Recepcionista {

    private int codigo;
    private String nome;
    private String telefone;
    private String turno;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String telefone, String turno) {
        this.nome = nome;
        this.telefone = telefone;
        this.turno = turno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
