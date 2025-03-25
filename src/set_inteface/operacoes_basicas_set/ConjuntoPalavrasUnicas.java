/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.operacoes_basicas_set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Windows 10 PRO
 */
public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }
    
    public void removerPalavra(String palavra){
        PalavrasUnicas palavraParaRemover = null;
        
        for(PalavrasUnicas p: palavrasUnicasSet){
            if(p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        
        palavrasUnicasSet.remove(palavraParaRemover);
    }
    
   public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
  }
   
   public void exibirPalavrasUnicas(){
       System.out.println(palavrasUnicasSet);
   }
   
    public static void main(String[] args) {
         // Criando uma instância da classe ConjuntoPalavrasUnicas
    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

    // Adicionando linguagens únicas ao conjunto
    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");

    // Exibindo as linguagens únicas no conjunto
    conjuntoLinguagens.exibirPalavrasUnicas();

    // Removendo uma linguagem do conjunto
    conjuntoLinguagens.removerPalavra("");
    conjuntoLinguagens.exibirPalavrasUnicas();

    // Removendo uma linguagem inexistente
    conjuntoLinguagens.removerPalavra("Swift");

    // Verificando se uma linguagem está no conjunto
    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

    // Exibindo as linguagens únicas atualizadas no conjunto
    conjuntoLinguagens.exibirPalavrasUnicas();
    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
    }
}
