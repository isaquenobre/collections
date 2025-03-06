/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.operacoes_basicas;

/**
 *
 * @author Windows 10 PRO
 */
public class Tarefa {
    
    private String descricao;
    
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }

   /* @Override
    public String toString() {
        return "Tarefa{" + "descricao='" + descricao +'\'' + '}';
    }*///esse é como toString vem padrão, o abaixo é como deixamos
    
    @Override
    public String toString() {
        return descricao;
    }
    
}
