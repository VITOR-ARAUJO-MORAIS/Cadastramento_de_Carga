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
public abstract class Caminhao {
    
    private String modelo;
    private String marca;
    private float pesoMax;
    private float capacidade;
    private float acumu = 0; 
    private float acumu1 = 0;
    
   
    
    public Caminhao (){}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }

    public float getPesoMax() {
        return pesoMax;
    }
    public void calculo (String peso[], String quantidade [], String altura[],String largura[]){ int i = 0;
    float a = Float.valueOf(altura[i]).floatValue();
  float l = Float.valueOf(largura[i]).floatValue();
  float q = Float.valueOf(quantidade[i]).floatValue();
  float ps = Float.valueOf(peso[i]).floatValue();
  float resp = ps*q;
  float resp1 = (a * l) * q; 
  acumu += resp;
  acumu1 += resp1;

  if (acumu > getPesoMax()){JOptionPane.showMessageDialog(null, "O peso excede o limite do caminhão");
  acumu -= resp;}
  if (acumu1 > getCapacidade()){JOptionPane.showMessageDialog(null, "excede a capacidade do caminhão");
  acumu -= resp1;}}
    
public String toString(){return "Dados sobre o caminhão " + modelo
+ "\nMarca: " + marca
+ "\nPeso Maximo: " + pesoMax
+ "\ncapacidade : " + capacidade;
} 
}


