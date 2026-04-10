package com.fatec.ads;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    String hora;
    String data;
    Medico medico;
    Paciente paciente;
    String motivo;
    String historico;
    List<Exame> exames = new ArrayList<>();
    List<Receita> receitas = new ArrayList<>();

    public List<Exame> getExames() {
        return exames;
    }
    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    public List<Receita> getReceitas() {
        return receitas;
    }
    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    public void marcar(){};
    public void cancelar(){};
    public void consultar(){};
    public void realizar(){};
    public void atualizar(){}
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) throws Exception  {
        if(motivo==null || motivo.length() <= 0 ) 
            throw  new Exception("Motivo da consulta e obrigatorio !!");
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public Consulta(String hora, String data, Medico medico, Paciente paciente, String motivo, String historico, List<Receita> r, List<Exame> e){
        this.hora = hora;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
        this.receitas = r;
        this.exames = e;
    }
    public Consulta() {
    }


    public void mostrar() {
        System.out.println("Consulta [getHora()=" + getHora() + ", getData()=" + getData() +" ,getMotivo()=" + getMotivo() + ", getHistorico()="+ getHistorico());
        getMedico().mostrar();
        getPaciente().mostrar(); 
        for(var obj : exames){
            obj.mostrar();
        }
        for(var obj: receitas){
            obj.mostrar();
        }
    };

    

}
