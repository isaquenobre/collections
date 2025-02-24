/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesquisa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10 PRO
 */
public class CatalogoLivros {
    private List <Livro> livroList;
    
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }   
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
       livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro>pesquisarPorAutor(String autor){
        List <Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
         for(Livro l: livroList){
             if(l.getAutor().equalsIgnoreCase(autor)){
                 livrosPorAutor.add(l);
             }
         }   
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;//aqui a lista começa vazia
        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo =  l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        
    }
}
    
    

