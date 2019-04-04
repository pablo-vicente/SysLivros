/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exercicio1.sislivros;

import java.util.ArrayList;

/**
 *
 * @author 05664790954
 */
public class Amigo {

    private int codigo;
    private String nome;
    private ArrayList<GeneroLivro> generosLivro;
    
    public Amigo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.generosLivro = new ArrayList<>();
    }
    public Amigo(){
        
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
    
    public void addGenero(GeneroLivro genero){
        
        if(!generosLivro.contains(genero)){
            generosLivro.add(genero);
        }
        if(!genero.contemAmigo(this)){
            genero.addAmigo(this);
        }
        
    }

    public boolean contemGenero(GeneroLivro genero) {
        boolean encotrouGenero = false;
        
        for(GeneroLivro generoLista : generosLivro){
            if(generoLista.getDescricao().equals(genero.getDescricao())){
                encotrouGenero = true;
                break;
            }
        }
        
        return encotrouGenero;
    }
    
    
}
