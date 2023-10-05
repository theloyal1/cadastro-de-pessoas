/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.ex01;

import com.github.lgooddatepicker.components.DatePicker;
import java.util.ArrayList;

/**
 *
 * @author IFTM
 */
public class Pessoa {
    private String nome, sexo, cep, uniFed, resumo;
    private ArrayList<String> gostos;
    private DatePicker dataNasc;
    
    public Pessoa() {
        this.gostos = new ArrayList<>();
    }

    public Pessoa(String nome, String cep, String uniFed, String resumo, String gostos, String sexo, DatePicker dataNasc) {
        this.nome = nome;
        this.cep = cep;
        this.uniFed = uniFed;
        this.gostos = new ArrayList<>();
        this.resumo = resumo;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUniFed() {
        return uniFed;
    }

    public void setUniFed(String uniFed) {
        this.uniFed = uniFed;
    }

    public ArrayList<String> getGostos() {
        return gostos;
    }

    public void setGostos(String g) {
        gostos.add(g);
    }
    
    public void removerGosto(String g) {
        gostos.remove(g);
    }
    
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public DatePicker getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(DatePicker dataNasc) {
        this.dataNasc = dataNasc;
    }
}
