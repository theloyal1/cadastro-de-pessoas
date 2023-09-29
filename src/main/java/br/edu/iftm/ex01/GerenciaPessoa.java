/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.iftm.ex01;

import java.util.ArrayList;

/**
 *
 * @author IFTM
 */
public class GerenciaPessoa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public GerenciaPessoa() {
    }
    
    public void cadastrar(Pessoa p) {
        pessoas.add(p);
    }
    
    public void excluir(int pos) {
        pessoas.remove(pos);
    }
    
    public ArrayList<Pessoa> imprimir() {
        return pessoas;
    }
}
