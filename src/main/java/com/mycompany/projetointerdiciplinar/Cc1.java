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
public class Cc1 extends Caminhao{
    
 private int numeroBaus;
 
 public Cc1(){}

    public void setNumeroBaus(int nM) {
        this.numeroBaus = nM;
    }

    public int getNumeroBaus() {
        return numeroBaus;
    }

  public String toStringcc1(){String nM = Integer.toString(numeroBaus);
  return "\nNumero de Baús: " + nM;}
 
 
}
