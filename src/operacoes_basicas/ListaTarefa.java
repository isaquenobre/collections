/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10 PRO
 */
public class ListaTarefa {
    private List <Tarefa> tarefaList;
    
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
            
        }
        tarefaList.removeAll(tarefasParaRemover);
    } 
        
    public int obterNumeroTotalTarefas(){
      return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
        public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();
            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
            
            listaTarefa.adicionarTarefa("Tarefa 1");
            listaTarefa.adicionarTarefa("Tarefa 1");
            listaTarefa.adicionarTarefa("Tarefa 2");
            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
            
            listaTarefa.removerTarefa("Tarefa 1");
            System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
            
            listaTarefa.obterDescricoesTarefas();
            
            
    }
    
}
