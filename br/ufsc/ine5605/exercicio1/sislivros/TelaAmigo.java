/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.exercicio1.sislivros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 05664790954
 */
public class TelaAmigo {
    private Scanner teclado = new Scanner(System.in);
    private ControladorAmigo ctrlAmigo;
    private ControladorAmigo This;
    
    public TelaAmigo(ControladorAmigo ctrlAmigo){
        teclado = new Scanner(System.in);
        this.ctrlAmigo = ctrlAmigo;
        
    }

  
  
   
    
    
    public void exibeMenuInicial() {
        
        int opcao = 0;
        
        do{
            
        
            System.out.println("-----------------SisAmigo-------------------------");
            System.out.println("1 - Cadastra Amigo");
            System.out.println("2 - Exlui Amigo");
            System.out.println("3 - Altera Amigo");
            System.out.println("4 - Lista Amigo");
            System.out.println("0 - Encerra");
            System.out.println("Escolha a opção");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    cadastraAmigo();
                    break;
                case 2:
                    excluiAmigo();
                    break;
                case 3:
                    alteraAmigo();
                    break;
                case 4:
                    listaAmigo();
                    break;    
                }
        }    
        while(opcao != 0);
        
    }

    private void cadastraAmigo() {
            
            int codigo = pedeCodigoAmigo();
            
            System.out.println("Digite o nome: ");
            String nome = teclado.next();
            
            Amigo amigo = new Amigo(codigo, nome);
            
            ctrlAmigo.incluiAmigo(amigo);
    }

    public void excluiAmigo() {
        int codigoParaExcluir = pedeCodigoAmigo();
        if(ctrlAmigo.excluiAmigoPeloCodigo(codigoParaExcluir)){
            System.out.println("Amigo exlcuido com sucesso!");
        } else{
            System.out.println("Não foi possivel Excluir Amigo!");
            
        }

 
    }

    public void alteraAmigo() {
        
    }

    public void listaAmigo() {
        ctrlAmigo.exibeListaAmigos();
    }

    private int pedeCodigoAmigo() {
            System.out.println("Digite o Código: ");
            int codigo = teclado.nextInt();
            return codigo;
    }

    
}
