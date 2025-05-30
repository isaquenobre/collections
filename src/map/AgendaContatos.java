/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Windows 10 PRO
 */


//essa aula aqui são as operações basicas do MAP
public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        
        agendaContatoMap.put(nome, telefone);
        
    }
    
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        
        return numeroPorNome;
        }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654897);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
        
        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();
        
        System.out.println("O numero é " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
    }
    
    

