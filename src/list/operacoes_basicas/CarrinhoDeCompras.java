/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10 PRO
 */
public class CarrinhoDeCompras {
    
    private List <Item> comprasFeitasList;
    
    
    
    public CarrinhoDeCompras(){
        this.comprasFeitasList = new ArrayList<>();
    }
    
      public void adicionarItem(String nome, double preco, int quantidade){
        //comprasFeitasList.add(new Item(nome, preco, quantidade));esse que eu fiz e rodou
        Item item = new Item(nome, preco, quantidade);
        this.comprasFeitasList.add(item);
    }
      
      public void removerItem(String nome){
        List<Item> comprasParaRemover = new ArrayList<>();
        for (Item i: comprasFeitasList){
            if(i.getNome().equalsIgnoreCase(nome)){
                comprasParaRemover.add(i);
            }
            
        }
        comprasFeitasList.removeAll(comprasParaRemover);
    } 
      
    /* public int calcularValorTotal(){
      return comprasFeitasList.size();
     
    } 
     
     public void exibirItens(String nome, double preco, int quantidade){
        System.out.println(comprasFeitasList);
    }*/
      
       public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!comprasFeitasList.isEmpty()) {
      for (Item item : comprasFeitasList) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirItens() {
    if (!comprasFeitasList.isEmpty()) {
      System.out.println(this.comprasFeitasList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
  
  
  @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + comprasFeitasList +
        '}';
  }

     
     
     public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
         
       /*  System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());
            
       carrinhoDeCompras.adicionarItem("camisa", 15.50, 22);
       carrinhoDeCompras.adicionarItem("camisa", 15.50, 22);
       carrinhoDeCompras.adicionarItem("esfira", 15.50, 10);
            
         System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());
            
       carrinhoDeCompras.removerItem("esfira");
       System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());
       carrinhoDeCompras.exibirItens();*/
       
        // Criando uma instância do carrinho de compras


    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 4.30d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 70d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        
    }
    
    
}
