/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set_inteface.pesquisa;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Windows 10 PRO
 */
public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    
    
    
}
