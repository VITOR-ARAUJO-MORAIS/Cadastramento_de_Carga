/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetointerdiciplinar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author VITOR
 */
public class ProjetoInterdiciplinar {

    public static void main(String[] args) {
        
        //Atributos
        int num = 1;
        int i = 0;
       int resp = 0;
       int f = 0;
       
    
       
        int[] codigo = new int [100];
        Random random = new Random();
        String[] produto = new String [100];
        String[] peso = new String [100];
        String[] altura = new String [100];
        String[] largura = new String [100];
        String[] quantidade = new String [100];
        
        Vuc mc1016 = new Vuc(); 
        Cc1 caminhao1 = new Cc1();
        Cc1 caminhao2 = new Cc1();
        
        mc1016.setModelo("MC - 1016");
        mc1016.setMarca("Volkswagen"); 
        mc1016.setPesoMax(3000);
        mc1016.setCapacidade(46875);
        mc1016.setondeAnda("Urbano");
        
        caminhao1.setModelo("SC - 1980");
        caminhao1.setMarca("Scania");
        caminhao1.setPesoMax(5700);
        caminhao1.setCapacidade(82270);
        caminhao1.setNumeroBaus(2);
        
        caminhao2.setModelo("C90");
        caminhao2.setMarca("Ford");
        caminhao2.setPesoMax(9900);
        caminhao2.setCapacidade(102250);
        caminhao2.setNumeroBaus(2);
        
          
        
        Carga cm1 = new Carga();
  
   
        
        //Menu e Chamada de Métodos
        
       while(num >0 && num<5){String pane = JOptionPane.showInputDialog(null, "Sistema de controle de cargas para transportadora\n" 
        + "\nDigite 1 para cadastrar uma nova carga"
        + "\nDigite 2 para consultar as cargas já existentes"
        + "\nDigite 3 para editar ou excluir uma carga do sistema"
        + "\nDigite 4 para ver nossos caminhões"
        + "\nDigite 5 para sair"
       );
    
    num = Integer. parseInt(pane);
          //cadastrar
        switch (num){
            case 1: 
               
                    JOptionPane.showMessageDialog(null, "Cadastro de carga" );
                resp = JOptionPane.YES_OPTION;
            while(resp == JOptionPane.YES_OPTION){
               
             produto[i] = JOptionPane.showInputDialog(null,"Qual o produto desta carga?");        
             peso[i] = JOptionPane.showInputDialog(null,"Qual o peso desta carga?");
             altura[i] = JOptionPane.showInputDialog(null,"Qual a altura desta carga?");
             largura[i] = JOptionPane.showInputDialog(null,"Qual a largura desta carga?");
             quantidade[i] = JOptionPane.showInputDialog(null,"Qual  a quantidade desta carga?");
             codigo[i] = random. nextInt(1000)*1000;
             
            
             cm1.setProduto(produto[i], i);
             cm1.setAltura(altura[i], i);
             cm1.setLargura(largura[i], i);
             cm1.setPeso(peso[i], i);
             cm1.setQuantidade(quantidade[i], i);
             cm1.setCodigo(codigo[i], i);
               
                JOptionPane.showMessageDialog(null, "Código da carga  gerado com sucesso\n"
                       + "Código da carga: " + cm1.getCodigo(i));
                
             i++;
             mc1016.calculo(peso, quantidade, altura, largura);
            
             f++;
            resp = JOptionPane.showConfirmDialog(null, "Deseja  cadastrar outra carga ?"); 
            
            }  
            break;
            //consultar
             case 2: 
            JOptionPane.showMessageDialog(null,"Consulta de cargas ");
            i = 0;
           
            for(i = 0; i < f;i++){if (cm1.getCodigo(i) > 0){
                cm1.imprime(i, cm1.getProduto(i), cm1.getPeso(i), cm1.getAltura(i), cm1.getLargura(i), cm1.getQuantidade(i), cm1.getCodigo(i));}
            }
            
            break;
            // menu editar e remover
             case 3: String resp3 = JOptionPane.showInputDialog(null,"Digite 1 para remover" + "\n Digite 2 para editar" + "\nDigite 3 para voltar ao menu principal" );  
                 int c = Integer.parseInt(resp3);
                 //remover
                 if(c == 1){
                 resp3 = JOptionPane.showInputDialog(null,"Insira o código da carga para remover");  
             int remover = Integer.parseInt(resp3);
             
             
                
             for(i = 0;i <f;i++){
                 if (remover == cm1.getCodigo(i))
                 {
                     cm1.setCodigo(0, i);
                 JOptionPane.showMessageDialog(null,"Carga removida");}
             
             }
                 }
                 //------------
                 //editar
                 if(c == 2){String respedit = JOptionPane.showInputDialog(null, "insira o código da carga para editar");
                 int edit = Integer.parseInt(respedit);
                 for (i = 0; i < f; i++){
                 if (edit == cm1.getCodigo(i)){produto[i] = JOptionPane.showInputDialog(null,"Qual o produto desta carga?");        
             peso[i] = JOptionPane.showInputDialog(null,"Qual o peso desta carga?");
             altura[i] = JOptionPane.showInputDialog(null,"Qual a altura desta carga?");
             largura[i] = JOptionPane.showInputDialog(null,"Qual a largura desta carga?");
             quantidade[i] = JOptionPane.showInputDialog(null,"Qual  a quantidade desta carga?");
             
             cm1.setProduto(produto[i], i);
             cm1.setAltura(altura[i], i);
             cm1.setLargura(largura[i], i);
             cm1.setPeso(peso[i], i);
             cm1.setQuantidade(quantidade[i], i);
             JOptionPane.showMessageDialog(null,"Carga " + (i+1) + " Editada com sucesso" );
                 }
                 }
                 
                 }
                 if (c > 2 || c <1){                 if (c > 2 || c <1){}
}
                 break;
                             //caminhões
             case 4: String resp4 = JOptionPane.showInputDialog(null,"Qual caminhão deseja ver?" 
                     + "\nDigite 1 para o caminhão " + mc1016.getModelo()
              + "\nDigite 2 para o caminhão " + caminhao1.getModelo()
              + "\nDigite 3 para o caminhão " + caminhao2.getModelo()); 
             int r = Integer.parseInt(resp4);
             
             switch (r){
                 case 1: JOptionPane.showMessageDialog(null, mc1016.toString() + mc1016.toStringVuc()); 
                 break;
                 case 2:JOptionPane.showMessageDialog(null, caminhao1.toString() + caminhao1.toStringcc1()); 
                 break;
                 case 3:JOptionPane.showMessageDialog(null, caminhao2.toString() + caminhao2.toStringcc1()); 
                 break;
                 
             }
             break;
                 
        }
                 
                
                 }
       }
    }

                
                 
                     
        
                  
                         
                 
     
                
    
       
       
    
    








    
    

 
