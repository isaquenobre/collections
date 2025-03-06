/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Windows 10 PRO
 */
public class OrdenacaoPessoas {
    private List <Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoas(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        
    }
    
    
    public List<Pessoa>ordenarPorAltura(){
       List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
       Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
       return pessoasPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        
        ordenacaoPessoa.adicionarPessoas("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoas("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoas("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoas("Nome 4", 17, 1.56);
        
        System.out.println(ordenacaoPessoa.pessoaList);
        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
    
}
 


