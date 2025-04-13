/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

import java.time.LocalDate;
import java.time.Month;
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
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry:eventosTreeMap.entrySet()){
          if(entry.getKey().equals(dataAtual)|| entry.getKey().isAfter(dataAtual)){
              System.out.println("O proximo evento: " + entry.getValue() + "acontecerá na data " + entry.getKey());
              break;
        
        
       /*Map<LocalDate, Evento> eventoTreemap = new TreeMap<>(eventoMap);
       for(Map.Entry<LocalDate, Evento> entry:eventoTreemap.entrySet()){
           if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();
               System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
          break;*/
           }
        
    }
    }   
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"Evento 1","Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022,7, 15),"Evento 2","Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 15),"Evento 3","Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15),"Evento 5","Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 15),"Evento 6","Atração 6");
        
        
        agendaEventos.exibirAgenda();
        
        agendaEventos.obterProximoEvento();
    }
}
