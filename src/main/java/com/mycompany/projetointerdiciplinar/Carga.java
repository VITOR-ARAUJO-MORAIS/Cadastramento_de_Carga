/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointerdiciplinar;

import javax.swing.JOptionPane;

/**
 *
 * @author VITOR
 */
public class Carga {
 

float acumu = 0;
    private String[] produto = new String [1000];
    private String[] peso = new String [1000];
    private String[] altura = new String [1000];
    private String[] largura = new String [1000];
    private String[] quantidade = new String [1000];
    private int[] codigo = new int [1000];
    private int[] numero = new int [1000];
    
    public Carga(){}
    
 

    public void setAltura(String a, int i) {
        this.altura[i] = a;
        
    }

    public String getAltura(int i) {
        return altura[i];
    }

    public void setLargura(String l, int i) {
        this.largura[i] = l;
    }

    public String getLargura(int g) {
        return largura[g];
    }

    public void setPeso(String p, int i) {
        this.peso[i] = p;
      
    }

    public String getPeso(int i) {
        return peso[i];
        
    }

    public void setProduto(String p, int n) {
        produto[n] = p;
    }

    public String getProduto(int i){
       
        return produto[i];
        
    }

    public void setQuantidade(String q, int i) {
        this.quantidade[i] = q;
       
    }

    public String getQuantidade(int g) {
        return quantidade[g];
    }

    public void setCodigo(int c, int i) {
        this.codigo[i] = c;
        
    }

    public int getCodigo(int g) {
        return codigo[g];
    }

    public int getNumero(int i) {
        return numero[i];
    }

    public void setNumero(int numero) {
        this.numero[numero] = numero;
    }

public void imprime(int i, String pr, String p, String a, String l, String q, int c){
    JOptionPane.showMessageDialog(null,"Carga "+ (i+1) + " de codigo "+ c + "\nProduto: " + 
                    pr + "\nPeso: " + p + "\nAltura: " + a + "\nLargura: " + l + "\nQuantidade: " + q );}
}



   
    

