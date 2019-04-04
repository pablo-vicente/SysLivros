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
public class ControladorAmigo {
    private ArrayList<Amigo> listaAmigos;
    private TelaAmigo telaAmigo;
    
    public ControladorAmigo(){
        telaAmigo = new TelaAmigo(this);
        listaAmigos = new ArrayList<>();
    }
    
    public void inicia() {
        telaAmigo.exibeMenuInicial();
    }


    public void incluiAmigo(Amigo amigo) {
        listaAmigos.add(amigo);
        
        
    }
    void exibeListaAmigos() {
        System.out.println("-----------------Lista Amigo--------------------");
        for (Amigo amigo : listaAmigos){
            System.out.println("Amigo: " + amigo.getNome());
            System.out.println("Código Amigo: " + amigo.getCodigo());
        }
    }

    public boolean excluiAmigoPeloCodigo(int codigoParaExcluir) {
        
        boolean conseguiExcluir = false;
        
        for(Amigo amigoExcluir : listaAmigos){
            if( amigoExcluir.getCodigo() == codigoParaExcluir){
                listaAmigos.remove(amigoExcluir);
                conseguiExcluir = true;
                break;
            }
        }
        
        return conseguiExcluir;
    }

   
}
