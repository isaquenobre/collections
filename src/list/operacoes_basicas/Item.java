/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes_basicas;

/**
 *
 * @author Windows 10 PRO
 */
public class Item {
    
    private String nome;
    private double preco;
    private int quantidade;
    
    
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    
     public double getPreco(){
        return preco;
    }
     
     public int getQuantidade(){
        return quantidade;
    }
     
    @Override
    public String toString() {
        return nome;
    }

}
