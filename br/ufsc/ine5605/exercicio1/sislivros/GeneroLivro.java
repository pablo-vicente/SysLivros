/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exercicio1.sislivros;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class GeneroLivro {

    private ArrayList<Amigo> amigos;
    private String descricao;
    
    public GeneroLivro(){
        this.amigos = new ArrayList<>();
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
 
    
    public void addAmigo(Amigo amigo) {
        if(!contemAmigo(amigo)){
              amigos.add(amigo);     
        }
        if(!amigo.contemGenero(this)){
            amigo.addGenero(this);
        }
        
    }
    
    public boolean  contemAmigo(Amigo amigo) {
        boolean encontrouAmigo = false;
        for(Amigo amigoLista : amigos){
            if(amigoLista.getCodigo() == amigo.getCodigo()){
            encontrouAmigo = true;
            break;
        }
        }
        
        return encontrouAmigo;
    }

    
}
