/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.ordenacao_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Windows 10 PRO
 */
public class CadastroProdutos {
     private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
     
    
 public void adicionarProduto(long cod, String nome, double preco, int quantidade){
     produtoSet.add(new Produto(cod, nome, preco, quantidade));
 }
 
 public Set<Produto> exibirProdutosPorNome(){
     Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);//o HashSet nao deixa organizado a lista, só o TreeSet
  return produtosPorNome;   
 }
 
 
 public Set<Produto> exibirProdutosPorPreco(){
     Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
     produtosPorPreco.addAll(produtoSet);
     return produtosPorPreco;
 }
 
    public static void main(String[] args) {
     CadastroProdutos cadastroProdutos = new CadastroProdutos();
     
     cadastroProdutos.adicionarProduto(1l, "Produto 5", 15d, 5);
     cadastroProdutos.adicionarProduto(2l, "produto 0", 20d, 10);
     cadastroProdutos.adicionarProduto(1l, "produto 3", 10d, 2);
     cadastroProdutos.adicionarProduto(9l, "produto 9", 2d, 2);
     
        System.out.println(cadastroProdutos.produtoSet);
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
 
}
