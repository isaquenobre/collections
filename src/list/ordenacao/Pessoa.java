/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.ordenacao;

import java.util.Comparator;

/**
 *
 * @author Windows 10 PRO
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;
    
    
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
       @Override
    public int compareTo(Pessoa p) {
      return Integer.compare(idade, getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }


 
    
    
}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}