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
public class Vuc extends Caminhao {
    
     private String ondeAnda;
    
public Vuc (){}


 

    public void setondeAnda(String oA) {
        this.ondeAnda = oA;
    }

    public String  getondeAnda() {
        return ondeAnda;
    }

  public String toStringVuc(){
  return "\nAnda em local: " + ondeAnda;}
 

}