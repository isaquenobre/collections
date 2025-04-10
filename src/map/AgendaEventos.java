/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Windows 10 PRO
 */
public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
        /*outra opaçao poderia ser
        eventoMap.put(data, new Evento(nome, atracao));
        e nao precisaria do  "Evento evento = new Evento(nome, atracao);"
        */  
    }
    
    public void exibirAgenda(){
        Map<LocalDate, Evento>eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    
     
    
}
