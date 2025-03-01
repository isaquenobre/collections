/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.ordenacao;

import java.util.ArrayList;
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
    
    
    
    
}
