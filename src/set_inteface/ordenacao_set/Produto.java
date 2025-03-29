/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.ordenacao_set;

import java.util.Comparator;

/**
 *
 * @author Windows 10 PRO
 */
public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    private long cod;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCod() {
        return cod;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (this.cod ^ (this.cod >>> 32));
        return hash;
    }

    // equals e hashcode - neste caso - para um produto com o mesmo código ele será igual e por isso nao precisara ficar no SET
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.cod == other.cod;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", cod=" + cod + ", quantidade=" + quantidade + '}';
    }

   /* @Override // esse foi o que o netbeans fez
    public int compareTo(Produto o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
     @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
        
        //o compareToIgnoreCase verifica por ordem alfabetica os produtos
        
      
        
        
    }
    
}

class ComparatorPorPreco implements Comparator<Produto>{

   /* @Override
    public int compare(Produto o1, Produto o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
  @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }  
    
    
}