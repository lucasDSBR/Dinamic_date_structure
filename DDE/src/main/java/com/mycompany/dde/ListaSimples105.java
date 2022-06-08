/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dde;

/**
 *
 * @author lucas
 */
public class ListaSimples105 {
    IntNoSimples primeiro, ultimo;
    int numero_nos;
    
    ListaSimples105(){
        primeiro = ultimo = null;
        numero_nos = 0;
    }
    
    void insereNo_fim(IntNoSimples novoNo){
        novoNo.prox = null;
        if(primeiro == null)
            primeiro = novoNo;
        if(ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }
}
